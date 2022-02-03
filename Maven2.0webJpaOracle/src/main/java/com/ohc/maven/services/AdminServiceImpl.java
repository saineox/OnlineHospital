package com.ohc.maven.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohc.maven.dao.AdminRepo;
import com.ohc.maven.model.Admin;
import com.ohc.maven.model.Ids;
@Service
public class AdminServiceImpl implements IAdminService 
{
	@Autowired
	AdminRepo arep;

	@Override
	public List<Ids> getAllAdmin() 
	{
		// TODO Auto-generated method stub
		List<Ids>a=arep.findAll();
		
		return a;
	}
	
	
	//Add Admin
	@Override
	public List<Ids> addAdmin(Ids a) {
		// TODO Auto-generated method stub
		//List<Admin>al=arep.save(a); 
		Ids al=arep.save(a);
		return arep.findAll();
	}
	

	
	//Del Admin
	@Override
	public List<Ids> delByAdmin(Integer id) {
		// TODO Auto-generated method stub
		System.out.print("Srvice Delete");
		arep.deleteById(id);
		return arep.findAll();
	}


	@Override
	public List<Ids> updateAdmin(Ids a) {
		// TODO Auto-generated method stub
		arep.save(a);
		return arep.findAll();
	}

	
	
	@Override
	public List<Ids> getAllAdminSorted() {
		// TODO Auto-generated method stub
		
		List<Ids>c=arep.getAllAdminSorted();
		return c;
		//return null;
	}


	@Override
	public Optional<Ids> findAdmin(Integer id) {
		// TODO Auto-generated method stub
		Optional<Ids>c=arep.findById(id);
		
		return c;
	}


	@Override
	public List<Ids> findAdminByName(String fname) 
	{
		// TODO Auto-generated method stub
			List<Ids> c=arep.findByFname(fname);
			return c;
		}
	

	



}
