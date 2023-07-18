package com.example.jpadev;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person 
{
	@Id
	private int id;
	private String firstName;
	@Column(name="l_name")
	private String lastName;
	private int age;
	@Column(name="person_email")
	private String email;
	private String address;
	
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

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	
}

/*
 		Json Object
 		{
 			"id" : 101,
 			"firstName" : "vinayak",
 			"lastName" : "banavi",
 			"age" : 26,
 			"email" : "vb@gmail.com",
 			"address" : "bangalore"
 		}
 */
