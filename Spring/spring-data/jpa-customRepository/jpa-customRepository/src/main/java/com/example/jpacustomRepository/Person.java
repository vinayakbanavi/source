package com.example.jpacustomRepository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person 
{
	@Id
	private Integer aadharNum;
	
	private String firstName;
	private String lastName;
	private Integer age;
	private String gender;

	@Column(unique = true)
	private String email;

//	Getters and setters
	
	public Integer getAadharNum() 
	{
		return aadharNum;
	}
	
	public void setAadharNum(Integer aadharNum) 
	{
		this.aadharNum = aadharNum;
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
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getGender() 
	{
		return gender;
	}
	
	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	
}
