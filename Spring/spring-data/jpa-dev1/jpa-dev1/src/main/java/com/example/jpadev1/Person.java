package com.example.jpadev1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person 
{
	@Id
	private int id;
	private String firstName;
	private String lastName;
}
