package com.example.jpadev4;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private Integer empId;
	private String firstName;
	private String lastName;
	private Integer age;
	
	public Integer getEmpId() 
	{
		return empId;
	}
	
	public void setEmpId(Integer empId) 
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
}

/*
		  Json Object
		  
		  {
		  		"empId" : 101,
		  		"firstName" : "Vinayak",
		  		"lastName" : "Banavi",
		  		"age" : 27
		  }
 */