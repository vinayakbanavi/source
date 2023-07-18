package com.example.jpadev;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(BookId.class) // first we need to create a class with columns required to be primary
public class Book 
{
	/* Without BookId class
	 * @Id private String title;
	 * 									This will give exception in older version of java
	 * @Id private String author;
	 */
	
	@Id private String title;
	@Id private String author;
	
	private Integer pages;
	private String content;
	private String publisher;
}

//composite primary key