/*
		Old Way of using Composite Primary
 */

package com.example.jpapractice1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
@IdClass(Table6PrimaryId.class)
public class Table6 
{
//	in order to make composite Primary first we need to define the class for these Id's
//	we must Annotate This @IdClass()
//	now we are good to go with Annotating multiple @Id
	
	@Id
	private Integer id;
	
	@Id
	private String batch;
	
	
	private String productName;
	private String mfgDate;
	private String expDate;
}
