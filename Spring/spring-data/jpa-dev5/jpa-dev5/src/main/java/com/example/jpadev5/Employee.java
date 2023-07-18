package com.example.jpadev5;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private String empId;
	private String firstName;
	private String lastName;
	private Integer age;
	private String address;
	
	public String getEmpId() 
	{
		return empId;
	}
	
	public void setEmpId(String empId) 
	{
		this.empId = empId;
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
	
	public Integer getAge() 
	{
		return age;
	}
	
	public void setAge(Integer age) 
	{
		this.age = age;
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
 			"empId" : "101",
 			"firstName" : "Vinayak",
 			"lastName" : "Banavi",
 			"age" : 26,
 			"address" : "Bangalore" 
 		}
		{
		  "empId": "102",
		  "firstName": "Shrikant",
		  "lastName": "Patil",
		  "age": 25,
		  "address": "Hubli"
		}
 		{
 			"empId" : "103",
 			"firstName" : "Karthik",
 			"lastName" : "Nadagoudar",
 			"age" : 28,
 			"address" : "Bangalore" 
 		}
		{
		  "empId": "104",
		  "firstName": "Darshan",
		  "lastName": "C",
		  "age": 25,
		  "address": "Chitradurga"
		}
		
*/
