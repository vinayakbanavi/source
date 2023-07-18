/*
		Many-to-Many :
			By default Bidirectional
			We can't achieve unidirectional Mapping in many-to-many
 */


package com.example.manytomany;

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
	
	@ManyToMany
	private Set<Skill> skills = new HashSet();

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

	public Set<Skill> getSkills() 
	{
		return skills;
	}

	public void setSkills(Set<Skill> skills) 
	{
		this.skills = skills;
	}
}

/*
 		Json Objects
 		
 		{
 			"firstName" : "vinayak",
 			"lastName" : "banavi",
 			"skills" : [{"id" : 1}, {"id" : 2}  ]
 			
 		}
 		
 		{
 			"firstName" : "shreemant",
 			"lastName" : "patil",
 			"skills" : [{"id" : 1}, {"id" : 3}]
 		}
 		
 		{
 			"firstName" : "anirudd",
 			"lastName" : "desai",
 			"skills" : [{"id" : 2}, {"id" : 3}]
 		}
 
*/