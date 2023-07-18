/*
		--->   @Column
					By default each Attribute is considered as a column 
					with name = attributeName(auto generated)
						 nullable = true,
					     unique = false
		
				We can set the properties of the column by @Column
				
				it is used to add properties to the column
				1. name/value
				2. Nullable
				3. Unique
 */

package com.example.jpapractice1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Person")
public class Table2 
{
	@Id
	@Column(name="aadhar_no")
	private Integer id;
	
	@Column(name="first_name", nullable= false)
	private String column1;
	
	@Column(name="last_name")
	private String column2;
	
	@Column(name="age", nullable = false)
	private Integer column3;
	
	@Column(name="email", unique = true)
	private String column4;
}
