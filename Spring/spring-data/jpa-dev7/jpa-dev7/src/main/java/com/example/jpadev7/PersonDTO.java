/*
		DTO stands for Data Transfer Object, which is a design pattern.
		It is one of the EPA patterns which we call when we need to use such objects that encapsulate and aggregate data for transfer.
		A DTO is similar to a data structure, but like a data structure, 
		it doesn't contain any business logic. It contains mechanisms of serialization and de-serialization. 
		In DTO, we can store data from a single source or from multiple resources. 
		We can either store complete data or can store a small amount of data from a source.
 */

package com.example.jpadev7;

public class PersonDTO 
{
	private String firstName;
	private String email;
	private Integer age;
	
	PersonDTO(String firstName, String email, Integer age)
	{
		this.firstName = firstName;
		this.email = email;
		this.age = age;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public String getEmail() 
	{
		return email;
	}

	public Integer getAge() 
	{
		return age;
	}	
}
