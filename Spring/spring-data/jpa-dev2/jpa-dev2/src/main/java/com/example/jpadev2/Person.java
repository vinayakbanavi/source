package com.example.jpadev2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// for every entity class table will be created automatically by the framework
@Entity
public class Person 
{
//	for hibernate every class must have a primary key column
	@Id // primary key column can be achieved through @Id
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
}

/*
	Json object 
	
	{
		"id" : 101,
		"firstName" : "Vinayak",
		"lastName" : "Banavi",
		"age" : 26
	}
*/