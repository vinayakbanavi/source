package com.example.jpadev;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
// composite unique
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = { "firstName", "lastName"})})
public class Customer 
{
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
}
