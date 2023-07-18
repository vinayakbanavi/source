/*
 		Many-to-Many is Bidirectional by default
 */

package com.example.mapping3;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String firstName;
	private String lastName;
	private Integer age;
	
	@ManyToMany
	private Set<Skill> skill;

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

	public Set<Skill> getSkill() 
	{
		return skill;
	}

	public void setSkill(Set<Skill> skill) 
	{
		this.skill = skill;
	}
}

/*
 		Json Object
 		
 		{
		  	"firstName" : "vinayak",
		  	"lastName" : "banavi",
		  	"skill" : [{"id" : 2}, {"id" : 3}]
		}
		
		{
		  	"firstName" : "vikram",
		  	"lastName" : "adityan",
		  	"skill" : [{"id" : 1}, {"id" : 2}]
		}
 */
