package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ohc.maven.dao.AdminRepo;
import com.ohc.maven.dao.DocterRepo;
import com.ohc.maven.dao.PatientRepo;
import com.ohc.maven.model.Admin;
import com.ohc.maven.model.Ids;
import com.ohc.maven.model.Patient;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() 
	{
	}
	
	@Autowired
	AdminRepo r1;
	DocterRepo r2;
	PatientRepo r3;
	
	@Test
	void testGetAdmin() {

		List<Ids> list = r1.findAll();
		assertNotNull(list);
	}
	@Test
	void testGetDoctors() {

		List<Ids> list = r2.findAll();
		assertNotNull(list);
	}
	@Test
	void testGetPatient() {

		List<Ids> list = r3.findAll();
		assertNotNull(list);
	}


}
















/*
 * package com.example.demo;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.boot.test.context.SpringBootTest;
 * 
 * @SpringBootTest class ApplicationTests {
 * 
 * @Test void contextLoads() { }
 * 
 * }
 */
