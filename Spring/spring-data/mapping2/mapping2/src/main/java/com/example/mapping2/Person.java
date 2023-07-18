package com.example.mapping2;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String firstName;
	private String lastName;
	
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	private Set<ContactInfo> contactInfo;
	
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

	public Set<ContactInfo> getContactInfo()
	{
		return contactInfo;
	}

	public void setContactInfo(Set<ContactInfo> contactInfo)
	{
		this.contactInfo = contactInfo;
	}
}

/*	
 		json object
 		{
			  "firstName": "vinayak",
			  "lastName": "banavi",
			  "contactInfo" : [{"contactNo" : 8553136080, "service" : "jio"},{"contactN0" : 8073810817, "service" : "airtel"}]
		}
 */
