package com.example.mapping3;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Skill 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String skill;
	private String skillDesc;
	
	@ManyToMany(mappedBy = "skill")
	@JsonIgnore
	private Set<Student> student = new HashSet<>();

	public Integer getId() 
	{
		return id;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public String getSkill() 
	{
		return skill;
	}

	public void setSkill(String skill) 
	{
		this.skill = skill;
	}

	public String getSkillDesc() 
	{
		return skillDesc;
	}

	public void setSkillDesc(String skillDesc) 
	{
		this.skillDesc = skillDesc;
	}

	public Set<Student> getStudent() 
	{
		return student;
	}

	public void setStudent(Set<Student> student) 
	{
		this.student = student;
	}
}
/*
 		json Object
 		
 		{
		  	"skill" : "C++",
		  	"skillDesc" : "Objects, Classes, Data Abstraction, Encapsulation, Inheritence, Polymorphism, Dynamic Binding, Message Passsing"
		}
		
		{
		  	"skill" : "Java",
		  	"skillDesc" : "OOOPs, Exception handling, Threading and Concurrency"
		}
		
		{
		  	"skill" : "Spring",
		  	"skillDesc" : "Web, JPA, MicroServices"
  	    }
 */

