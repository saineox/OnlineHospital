package com.ohc.maven.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.ohc.maven.model.Patient;
import com.ohc.maven.model.Ids;

@Service
public interface IPatientService 
{
	
	public List<Ids> getAllPatient();
	public List<Ids> addPatient(Ids a);
	List<Ids> delByPatient(Integer id);
	List<Ids> updatePatient(Ids a);
	
	Optional<Ids> findPatient(Integer id);
	List<Ids> getAllPatientSorted();
	List<Ids> findPatientByName(String fname);
	
	
	
	//public List<Patient> getAllPatient();
	
	//public List<Patient> addPatient(Patient c);
	//public List<Patient> deletByPatient(Integer cid);
	//public Optional<Patient> findPatient(Integer cid);
	//public List<Patient> findCity(String city);
	//public List<Patient> findPatient(String city);
	//public List<Patient> getAllPatient();
	//public List<Patient> getAllPatientSorted();
	//public List<Patient> updatePatient(Patient c);
	
	//public List<Patient> updateByCid(Integer cid,Patient c);
	
	
	

}
