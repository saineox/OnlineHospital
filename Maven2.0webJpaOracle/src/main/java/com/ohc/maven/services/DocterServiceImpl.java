package com.ohc.maven.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohc.maven.dao.DocterRepo;
import com.ohc.maven.model.Docter;
import com.ohc.maven.model.Ids;
@Service
public class DocterServiceImpl implements IDocterService 
{
	@Autowired
	DocterRepo drep;

	@Override
	public List<Ids> getAllDocter() 
	{
		// TODO Auto-generated method stub
		List<Ids>a=drep.findAll();
		
		return a;
	}
	
	
	//Add Docter
	@Override
	public List<Ids> addDocter(Ids a) {
		// TODO Auto-generated method stub
		//List<Docter>al=drep.save(a); 
		Ids al=drep.save(a);
		return drep.findAll();
	}
	

	
	//Del Docter
	@Override
	public List<Ids> delByDocter(Integer id) {
		// TODO Auto-generated method stub
		System.out.print("Srvice Delete");
		drep.deleteById(id);
		return drep.findAll();
	}


	@Override
	public List<Ids> updateDocter(Ids a) {
		// TODO Auto-generated method stub
		drep.save(a);
		return drep.findAll();
	}

	
	
	@Override
	public List<Ids> getAllDocterSorted() {
		// TODO Auto-generated method stub
		
		List<Ids>c=drep.getAllDocterSorted();
		return c;
		//return null;
	}


	@Override
	public Optional<Ids> findDocter(Integer id) {
		// TODO Auto-generated method stub
		Optional<Ids>c=drep.findById(id);
		
		return c;
	}


	@Override
	public List<Ids> findDocterByName(String fname) 
	{
		// TODO Auto-generated method stub
			List<Ids> c=drep.findByFname(fname);
			return c;
		}
	

	



}
