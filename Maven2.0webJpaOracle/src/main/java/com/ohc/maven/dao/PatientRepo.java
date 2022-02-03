package com.ohc.maven.dao;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ohc.maven.model.Admin;
import com.ohc.maven.model.Ids;


public interface PatientRepo extends JpaRepository<Ids, Integer>
{
	@Query("from Patient order by fname")
	List<Ids> getAllPatientSorted();

	@Query("from Patient order by fname")
	List<Ids> findByFname(String fname);
	
	
}
