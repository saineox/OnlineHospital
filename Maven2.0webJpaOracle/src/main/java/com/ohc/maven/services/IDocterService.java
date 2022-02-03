package com.ohc.maven.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.ohc.maven.model.Docter;
import com.ohc.maven.model.Ids;

@Service
public interface IDocterService 
{
	
	public List<Ids> getAllDocter();
	public List<Ids> addDocter(Ids a);
	List<Ids> delByDocter(Integer id);
	List<Ids> updateDocter(Ids a);
	List<Ids> getAllDocterSorted();
	Optional<Ids> findDocter(Integer id);
	List<Ids> findDocterByName(String fname);
	
	
	
	//public List<Docter> getAllDocter();
	
	//public List<Docter> addDocter(Docter c);
	//public List<Docter> deletByDocter(Integer cid);
	//public Optional<Docter> findDocter(Integer cid);
	//public List<Docter> findCity(String city);
	//public List<Docter> findDocter(String city);
	//public List<Docter> getAllDocter();
	//public List<Docter> getAllDocterSorted();
	//public List<Docter> updateDocter(Docter c);
	
	//public List<Docter> updateByCid(Integer cid,Docter c);
	
	
	

}
