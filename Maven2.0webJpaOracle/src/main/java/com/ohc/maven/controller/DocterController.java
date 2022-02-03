package com.ohc.maven.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ohc.maven.exception.NotFoundException;
import com.ohc.maven.model.Docter;
import com.ohc.maven.model.Ids;
import com.ohc.maven.services.DocterServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class DocterController 
{
	
	@Autowired
	DocterServiceImpl dser;
	
	
	@GetMapping(value="/docter/get",produces="application/json")
	public List<Ids> getDocter()
	{
	List<Ids>l=dser.getAllDocter();
	return l;
	}
	
	
	@PostMapping(value="/docter/add",produces="application/json")
	public List<Ids> addDocter(@RequestBody Docter d) throws Exception
	{
		List<Ids>l=dser.addDocter(d);
		if(l.size()<=0)
		{
			throw new Exception("Resource not Indserted");
		}
		return l;
	}

	@DeleteMapping(value="/docter/del/{aid}")
	public List<Ids> delByDocter(@PathVariable Integer aid) 
	{
		List<Ids>l=dser.delByDocter(aid);
			if(l.size()<=0)
			{
				throw new NotFoundException("NotFound");
			}
		return l;
	}

	
	@PutMapping(value="/docter/update")
	@ResponseBody
	public List<Ids> updateDocter(@RequestBody Docter d) throws Exception
	{
		List<Ids>l=dser.updateDocter(d);
		if(l.size()<=0)
		{
			throw new Exception("Not Found");
		}
		
		return l;
	}
	
	
	
	@GetMapping(value="/docter/sorted")
	//@ResponseBody
	public List<Ids> getc()
	{
		List<Ids>l=dser.getAllDocterSorted(); //query From Repo by udser
		return l;
	}
	
	
	@GetMapping(value="/docter/getid/{id}",produces="application/json")
	
	public Optional<Ids> getCompany(@PathVariable Integer id)
	{
		Optional<Ids>l=dser.findDocter(id);
		if(l==null)
		{
		throw new NotFoundException("Not Found");
		}
		return l;
	}
	
	
	
	@GetMapping(value="/docter/get/{fname}")
	@ResponseBody
	public List<Ids> findDocterByName(@PathVariable String fname)
	{
		List<Ids>l=dser.findDocterByName(fname);
		if(l.size()<=0)
		{
		throw new NotFoundException("Not Found");
		}
		
		return l;
	}
	
	
	
	
//	@PutMapping(value="/docter/update/{id}")
//	public List<Ids> updateByCid(@PathVariable Integer id, @RequestBody Docter a)
//	{
//		List<Ids>l=dser.updateByAid(id,a);
//		if(l.size()<=0)
//		{
//		throw new NotFoundException("Docter not Found");
//		}
//		
//		return l;
//	}
}
