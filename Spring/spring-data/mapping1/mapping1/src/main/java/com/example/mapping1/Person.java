package com.example.mapping1;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String firstName;
	private String lastName;
	private String age;
	
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Identity identity;
	
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
	
	public String getAge() 
	{
		return age;
	}
	
	public void setAge(String age) 
	{
		this.age = age;
	}

	public Identity getIdentity()
	{
		return identity;
	}

	public void setIdentity(Identity identity) 
	{
		this.identity = identity;
	}
	
	
}


/*
		JSON body
		
		{
			  "firstName": "vinayak",
			  "lastName": "banavi",
			  "age" : 27
		}
		
--> BiDirectional mapping

		{
			  "firstName": "vinayak",
			  "lastName": "banavi",
			  "age" : 27,
			  "identity" : {
			  					"aadharNum" : 1234,
			  					"panNum"    : "AB1234"
			  			   }
		}
		
		
 */
