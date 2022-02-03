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
import com.ohc.maven.model.Admin;
import com.ohc.maven.model.Ids;
import com.ohc.maven.services.AdminServiceImpl;

//http://localhost:8888/getAdmins
//http://localhost:8888/index
//http://localhost:8892/api/v1/getAdmins
//@Controller
//class AdminController3
//{
//	@RequestMapping("/index")
//	public String start()
//	{
//		return "index";
//	}
//}

@RestController
@RequestMapping("/api/v1")
public class AdminController 
{
	
	@Autowired
	AdminServiceImpl aser;
	
	
	@GetMapping(value="/admin/get",produces="application/json")
	public List<Ids> getAdmin()
	{
	List<Ids>l=aser.getAllAdmin();
	return l;
	}
	
	//@PostMapping(value="/{x}/add",produces="application/json")
	@PostMapping(value="/admin/add",produces="application/json")
	//public List<AAperson> addAdmin(@RequestBody object a) throws Exception
	public List<Ids> addAdmin(@RequestBody Admin a) throws Exception
	{
		List<Ids>l=aser.addAdmin(a);
		if(l.size()<=0)
		{
			throw new Exception("Resource not Inaserted");
		}
		return l;
	}

	@DeleteMapping(value="/admin/del/{aid}")
	public List<Ids> delByAdmin(@PathVariable Integer aid) 
	{
		List<Ids>l=aser.delByAdmin(aid);
			if(l.size()<=0)
			{
				throw new NotFoundException("NotFound");
			}
		return l;
	}

	
	@PutMapping(value="/admin/update")
	@ResponseBody
	public List<Ids> updateAdmin(@RequestBody Admin a) throws Exception
	{
		List<Ids>l=aser.updateAdmin(a);
		if(l.size()<=0)
		{
			throw new Exception("Not Found");
		}
		
		return l;
	}
	
	
	
	@GetMapping(value="/admin/sorted")
	//@ResponseBody
	public List<Ids> getc()
	{
		List<Ids>l=aser.getAllAdminSorted(); //query From Repo by uaser
		return l;
	}
	
	
	@GetMapping(value="/admin/getid/{id}",produces="application/json")
	
	public Optional<Ids> getCompany(@PathVariable Integer id)
	{
		Optional<Ids>l=aser.findAdmin(id);
		if(l==null)
		{
		throw new NotFoundException("Not Found");
		}
		return l;
	}
	
	
	
	@GetMapping(value="/admin/get/{fname}")
	@ResponseBody
	public List<Ids> findAdminByName(@PathVariable String fname)
	{
		List<Ids>l=aser.findAdminByName(fname);
		if(l.size()<=0)
		{
		throw new NotFoundException("Not Found");
		}
		
		return l;
	}
	
	
	
	
//	@PutMapping(value="/admin/update/{id}")
//	public List<Ids> updateByCid(@PathVariable Integer id, @RequestBody Admin a)
//	{
//		List<Ids>l=aser.updateByAid(id,a);
//		if(l.size()<=0)
//		{
//		throw new NotFoundException("Admin not Found");
//		}
//		
//		return l;
//	}
}
