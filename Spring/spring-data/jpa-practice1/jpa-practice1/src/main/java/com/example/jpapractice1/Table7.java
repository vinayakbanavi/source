/*
 		Composite Primary using @EmbeddedId
 */

package com.example.jpapractice1;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Patients")
public class Table7 
{
	@EmbeddedId
	private Table7PrimaryId id;
	
//	private Integer patientId;
//	private String patientName;
	
	private String bloodGroup;
	private Integer age;
}
