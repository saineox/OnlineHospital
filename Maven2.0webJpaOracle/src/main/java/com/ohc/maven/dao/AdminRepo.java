package com.ohc.maven.dao;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ohc.maven.model.Admin;
import com.ohc.maven.model.Ids;


public interface AdminRepo extends JpaRepository<Ids, Integer>
{
	//List<Ids> findByFname(String fname);
	@Query("from Admin order by fname")
	List<Ids> getAllAdminSorted();
	
	//@Query("from Admin where fname = ?1 and ?2")
	@Query("from Admin where fname = ?1")
	List<Ids> findByFname(String fname);

	//@Query("from Admin a where a.fname = fname")
	//@Query(value = "SELECT * FROM Admin u WHERE u.fname = :fname",nativeQuery = true)
	//@Query(value = "SELECT * FROM Admin u WHERE u.fname = fname")
	//List<Ids> findByFname(@Param("fname") String fname);
	
	
}
