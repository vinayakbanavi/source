package com.example.mapping1;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "aadharNum"),
							@UniqueConstraint(columnNames = "panNum")})
public class Identity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToOne
	@JsonIgnore
	private Person person;
	
	private Integer aadharNum;
	private String panNum;
	
	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	public Person getPerson() 
	{
		return person;
	}
	
	public void setPerson(Person person) 
	{
		this.person = person;
	}
	
	public Integer getAadharNum() 
	{
		return aadharNum;
	}
	
	public void setAadharNum(Integer aadharNum) 
	{
		this.aadharNum = aadharNum;
	}
	
	public String getPanNum() 
	{
		return panNum;
	}
	
	public void setPanNum(String panNum) 
	{
		this.panNum = panNum;
	}
}

/*
 			Json body
			{
				  "firstName": "vinayak",
				  "lastName": "banavi",
				  "age" : 27
			}
 */
