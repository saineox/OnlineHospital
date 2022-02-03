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
import com.ohc.maven.model.Patient;
import com.ohc.maven.model.Ids;
import com.ohc.maven.services.PatientServiceImpl;

//http://localhost:8888/getPatients
//http://localhost:8888/index
//http://localhost:8892/api/v1/getPatients
//@Controller
//class PatientController3
//{
//	@RequestMapping("/index")
//	public String start()
//	{
//		return "index";
//	}
//}
@RestController
@RequestMapping("/api/v1")
public class PatientController 
{
	
	@Autowired
	PatientServiceImpl pser;
	
	

	//@RequestMapping("/addPatient")
	//@ResponseBody
	//@PostMapping(value="/addPatient")
//	public List<Patient> addPatient(Patient a)
//	{
//		List<Patient>al= pser.addPatient(a);
//		return al;
//	}
	
	@GetMapping(value="/patient/get",produces="application/json")
	public List<Ids> getPatient()
	{
	List<Ids>l=pser.getAllPatient();
	return l;
	}
	
	//@PostMapping(value="/{x}/add",produces="application/json")
	@PostMapping(value="/patient/add",produces="application/json")
	//public List<AAperson> addPatient(@RequestBody object a) throws Exception
	public List<Ids> addPatient(@RequestBody Patient a) throws Exception
	{
		List<Ids>l=pser.addPatient(a);
		if(l.size()<=0)
		{
			throw new Exception("Resource not Inpserted");
		}
		return l;
	}

	@DeleteMapping(value="/patient/del/{aid}")
	public List<Ids> delByPatient(@PathVariable Integer aid) 
	{
		List<Ids>l=pser.delByPatient(aid);
			if(l.size()<=0)
			{
				throw new NotFoundException("NotFound");
			}
		return l;
	}

	
	@PutMapping(value="/patient/update")
	@ResponseBody
	public List<Ids> updatePatient(@RequestBody Patient a) throws Exception
	{
		List<Ids>l=pser.updatePatient(a);
		if(l.size()<=0)
		{
			throw new Exception("Not Found");
		}
		
		return l;
	}
	
	
	

	
	@GetMapping(value="/patient/getid/{id}",produces="application/json")
	
	public Optional<Ids> getCompany(@PathVariable Integer id)
	{
		Optional<Ids>l=pser.findPatient(id);
		if(l==null)
		{
		throw new NotFoundException("Not Found");
		}
		return l;
	}
	
	
	@GetMapping(value="/patient/sorted")
	//@ResponseBody
	public List<Ids> getc()
	{
		List<Ids>l=pser.getAllPatientSorted(); //query From Repo by upser
		return l;
	}
	
	
	@GetMapping(value="/patient/get/{fname}")
	@ResponseBody
	public List<Ids> findPatientByName(@PathVariable String fname)
	{
		List<Ids>l=pser.findPatientByName(fname);
		if(l.size()<=0)
		{
		throw new NotFoundException("Not Found");
		}
		
		return l;
	}
//	
//	
//	
	

}
