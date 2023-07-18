package com.example.jpadev7;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person 
{
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	
	@Column(unique = true)
	private String email;
	
	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id) 
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
	
	public Integer getAge() 
	{
		return age;
	}
	
	public void setAge(Integer age) 
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
	
	
}
/*
		Json objects

		{"id":101,"firstName":"sunil","lastName":"kumar","age":25,"email":"sunilk@gmail.com"}
		{"id":102,"firstName":"charan","lastName":"raj","age":23,"email":"rajcharan@gmail.com"}
		{"id":103,"firstName":"karan","lastName":"arjun","age":25,"email":"karjun@gmail.com"}
		{"id":104,"firstName":"ram","lastName":"narayan","age":35,"email":"ramnarayan@gmail.com"}
		{"id":105,"firstName":"chandra","lastName":"shekar","age":28,"email":"chandrashekar@gmail.com"}
		{"id":106,"firstName":"vinayak","lastName":"banavi","age":26,"email":"vinayakbanavi@gmail.com"}
		{"id":107,"firstName":"suraj","lastName":"chandra","age":21,"email":"surajchandra@gmail.com"}
		{"id":108,"firstName":"mrunal","lastName":"thakur","age":24,"email":"mrunalthakur@gmail.com"}
		{"id":109,"firstName":"samantha","lastName":"prabhu","age":36,"email":"samprabhu@gmail.com"}
		{"id":110,"firstName":"sheetal","lastName":"prabhu","age":31,"email":"sheetalprabhu@gmail.com"}
*/
