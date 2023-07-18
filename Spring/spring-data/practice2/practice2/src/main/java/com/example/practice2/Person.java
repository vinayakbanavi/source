package com.example.practice2;

public class Person
{
	private String firstName;
	private String lastName;
	private Address address;
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setAddress(Address address)
	{
		this.address = address;
	}
	
	public Address getAddress()
	{
		return address;
	}
}
/*
	JSON body
	{
		"firstName": "Vinayak",
		"lastName": "Banavi",
		"age" : 26,
		"address" : {
			 			"houseNo" : "123/A",
			 			"street" : "2nd Street",
			 			"area" : "BTM",
			 			"city" : "Bengaluru"
 			
 					}
	}
*/