package com.example.jpadev;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "std_table",
       uniqueConstraints = {@UniqueConstraint(columnNames =  "email"),
       						@UniqueConstraint(columnNames = "firstname")})
public class Student 
{
	@Id
	private String stdId;
	private String firstName;
	private String lastName;
	private String email;
}
