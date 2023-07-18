package com.example.mapping2;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ContactInfo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Long contactNo;
	private String service;
	
	@ManyToOne
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
	
	public Long getContactNo() 
	{
		return contactNo;
	}
	
	public void setContactNo(Long contactNo) 
	{
		this.contactNo = contactNo;
	}
	
	public String getService() 
	{
		return service;
	}
	
	public void setService(String service) 
	{
		this.service = service;
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
