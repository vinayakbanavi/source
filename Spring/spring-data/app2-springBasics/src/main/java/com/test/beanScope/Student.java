/**
 * Student : bean class
 * Used to test bean scope
 */

package com.test.beanScope;

public class Student 
{
	private String name;
	private String id;
	
	Student()
	{		
		System.out.println("Student Object created : " + this);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}	
}
