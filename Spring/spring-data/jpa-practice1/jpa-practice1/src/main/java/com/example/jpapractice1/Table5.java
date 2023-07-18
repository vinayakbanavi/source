package com.example.jpapractice1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="register")
public class Table5 
{
//	composite primary
	@Id
	private String id;
	@Id
	private String branch;
	
}

/*
 	This type of mentioning multiple @Id is incorporated in Newer Version Of java
 	
 	So we must know the primitive way also
*/