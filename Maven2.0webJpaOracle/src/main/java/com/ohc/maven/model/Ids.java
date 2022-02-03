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
	@Table(name="Ids")  //if change the name of table in database
	@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
	@DiscriminatorValue("Ids")
	public class Ids 
	{	@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Ids [id=" + id + "]";
	}

	public void setId(int id) {
		this.id = id;
	}
	}