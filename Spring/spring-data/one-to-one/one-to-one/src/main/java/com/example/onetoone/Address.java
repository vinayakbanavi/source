package com.example.onetoone;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String houseNo;
	private String street;
	private String city;
	
	@OneToOne
	@JsonIgnore
	private Person person;

	public Integer getId() 
	{
		return id;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public String getHouseNo() 
	{
		return houseNo;
	}

	public void setHouseNo(String houseNo) 
	{
		this.houseNo = houseNo;
	}

	public String getStreet() 
	{
		return street;
	}

	public void setStreet(String street) 
	{
		this.street = street;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public Person getPerson() 
	{
		return person;
	}

	public void setPerson(Person person) 
	{
		this.person = person;
	}
}

/*
 		JSON object
 		
 		{
 			"houseNo" : "100/A",
 			"street"  : "BTM",
 			"city"    : "Bangalore",
 			"person"  : {
 							"id" : 1
 						}
 		}
 					
 */
