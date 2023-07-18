/*
 	 --->	@Entity
		 		Annotates the specified class as a Entity class
		 		for entity class Spring framework will automatically create table

 	--->   @Id
		 		Annotates the specified attribute as a primary column
		 		Every Entity class must have a @Id (Primary key)
 */

package com.example.jpapractice1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//  Table table1/ No uniqueConstraints
public class Table1 
{
	@Id
//	primary key column/ nullable = false, unique = true
	private Integer id;
	
//	column firstName/ nullable = true, unique = false
	private String firstName;
		
//	column lastName/ nullable = true, unique = false
	private String lastName;
}
