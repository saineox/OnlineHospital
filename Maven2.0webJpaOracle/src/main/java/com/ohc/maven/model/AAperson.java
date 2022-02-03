package com.ohc.maven.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity   //Select classs for crud operation
@Table(name="AAperson")  //if change the name of table in database
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorValue("AAperson")
public class AAperson extends Ids
{	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int id;
	private String fname;
	private String mname;
	private String lname;
	private String city;
	private String gender;
	//private int age;
//	private int dob;
//	
//	private String user;
//	private String pass;
//	private String role;
//	private int aadhar;
//	private String email;
//	private int mobile;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "AAperson [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", city=" + city + "]";
	}


	
	
}
