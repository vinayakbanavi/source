package com.example.onetomany;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	private Set<MobileNumber> mobileNumber = new HashSet();
	
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

	public Set<MobileNumber> getMobileNumber() 
	{
		return mobileNumber;
	}

	public void setMobileNumber(Set<MobileNumber> mobileNumber) 
	{
		this.mobileNumber = mobileNumber;
	}
}

/*

            {
             
	          "firstName":"vinayak",
	          "lastName":"banavi",
	           "age":26
            }

	--> Bidirectional Mapping
	
		{
			"firstName":"Vijayendra",
		  	"lastName" : "Ingalagi",
		  	"age" : 45,
		  	"mobileNumber" : [{"mobileNumber" : 8553136080, "serviceProvider" : "jio"}, 
		                      {"mobileNumber" : 8073810817, "serviceProvider" : "airtel"}]
		}

*/