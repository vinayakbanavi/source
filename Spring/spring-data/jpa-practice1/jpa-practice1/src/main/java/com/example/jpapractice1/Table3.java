/*		
 ---> 	@Table
 		By default Table properties will be set automatically
 		name = entity class name
 		and no unique Constraints
 			
 		We can also set table properties
 			1. name
 			2. uniqueConstraints
 		
 		We can set any number of individual uniqueConstraint
 		* @Table(name="Any_Name", 
 		         uniqueConstraints = {@UniqueConstraint(columnNames = "column1"),
 		 							  @UniqueConstraint(columnNames = "column2")})
 		 							  
 		We can set composite unique
 		* @Table(name="Optional",
 		         uniqueCostraints = {@UniqueConstraint(columnNames = {"column1", "column2"})})
 */

package com.example.jpapractice1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity

// Individual Unique
@Table(name="cellphones", 
	   uniqueConstraints = { @UniqueConstraint(columnNames= "modelName"),
	   						 @UniqueConstraint(columnNames = "imei")})
public class Table3 
{
	@Id
	private String modelId;
	
	private String brand;
	
	private String modelName;
	
	private Integer price;
	
	private String imei;
	
}