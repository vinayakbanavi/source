package com.example.practice2;

public class Student 
{
	private String id;
	private String firstName;
	private String lastName;

	
	public String getId() 
	{
		return id;
	}
	
	public void setId(String id) 
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
	
	public String toString()
	{
		return "id : " + id + ", FirstName : " + firstName + ", LastName : " + lastName;
	}

}
