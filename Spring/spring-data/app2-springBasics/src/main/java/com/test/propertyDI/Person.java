/**
 * Person is a java bean class
 * Used for testing dependency injection
 */

package com.test.propertyDI;

public class Person 
{
	private String firstName;
	private String lastName;
	
	Person()
	{
		System.out.println("Person Object Created : " + this);
	}
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		System.out.println("Person.seFirstName : " + firstName);
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		System.out.println("Person.setLastName : " + lastName);
		this.lastName = lastName;
	}
}
