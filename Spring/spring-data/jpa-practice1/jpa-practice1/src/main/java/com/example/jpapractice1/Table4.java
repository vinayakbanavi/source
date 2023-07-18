package com.example.jpapractice1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
//Composite unique
@Table(name="employee",
	   uniqueConstraints = {@UniqueConstraint(columnNames = {"firstName", "lastName"})})
public class Table4 
{
	@Id
	 private int id;
	 
	 private String firstName;
	 private String lastName;
}
