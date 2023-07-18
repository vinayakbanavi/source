package com.example.jpadev;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@Column(name = "emp_id")
	private Integer id;
	
	@Column(name = "emp_name", nullable = false)
	private String firstName;
	
	@Column(unique = true)
	private String lastName;
	
	@Column(name = "emp_age")
	private Integer age;
	
}

/**
 	auto-ddl=update
  	@Column annotation can perform major changes while creating the table itself
  	but modifying certaing parameters on existing table will not be effective
  	
  	

*/