package com.ohc.maven.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohc.maven.dao.PatientRepo;
import com.ohc.maven.model.Patient;
import com.ohc.maven.model.Ids;
@Service
public class PatientServiceImpl implements IPatientService 
{
	@Autowired
	PatientRepo prep;

	@Override
	public List<Ids> getAllPatient() 
	{
		// TODO Auto-generated method stub
		List<Ids>a=prep.findAll();
		
		return a;
	}
	
	
	//Add Patient
	@Override
	public List<Ids> addPatient(Ids a) {
		// TODO Auto-generated method stub
		//List<Patient>al=prep.save(a); 
		Ids al=prep.save(a);
		return prep.findAll();
	}
	

	
	//Del Patient
	@Override
	public List<Ids> delByPatient(Integer id) {
		// TODO Auto-generated method stub
		System.out.print("Srvice Delete");
		prep.deleteById(id);
		return prep.findAll();
	}


	@Override
	public List<Ids> updatePatient(Ids a) {
		// TODO Auto-generated method stub
		prep.save(a);
		return prep.findAll();
	}

	
	



	@Override
	public Optional<Ids> findPatient(Integer id) {
		// TODO Auto-generated method stub
		Optional<Ids>c=prep.findById(id);
		
		return c;
	}


	
	@Override
	public List<Ids> getAllPatientSorted() {
		// TODO Auto-generated method stub
		
		List<Ids>c=prep.getAllPatientSorted();
		return c;
		//return null;
	}
	@Override
	public List<Ids> findPatientByName(String fname) 
	{
		// TODO Auto-generated method stub
			List<Ids> c=prep.findByFname(fname);
			return c;
		}
	

	



}
