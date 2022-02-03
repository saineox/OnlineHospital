package com.ohc.maven.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.ohc.maven.model.Admin;
import com.ohc.maven.model.Ids;

@Service
public interface IAdminService 
{
	
	public List<Ids> getAllAdmin();
	public List<Ids> addAdmin(Ids a);
	List<Ids> delByAdmin(Integer id);
	List<Ids> updateAdmin(Ids a);
	List<Ids> getAllAdminSorted();
	Optional<Ids> findAdmin(Integer id);
	List<Ids> findAdminByName(String fname);
	
	
	
	//public List<Admin> getAllAdmin();
	
	//public List<Admin> addAdmin(Admin c);
	//public List<Admin> deletByAdmin(Integer cid);
	//public Optional<Admin> findAdmin(Integer cid);
	//public List<Admin> findCity(String city);
	//public List<Admin> findAdmin(String city);
	//public List<Admin> getAllAdmin();
	//public List<Admin> getAllAdminSorted();
	//public List<Admin> updateAdmin(Admin c);
	
	//public List<Admin> updateByCid(Integer cid,Admin c);
	
	
	

}
