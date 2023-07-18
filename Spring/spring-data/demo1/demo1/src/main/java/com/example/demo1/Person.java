package com.example.demo1;


public class Person 
{
	private String firstName;
	private String lastName;
	private int age;
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String person) 
	{
		firstName = person;
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

// if every Attribute having getter and setter 
// such classes are called as POJO - plain old java object class
// Bean class or POJO class