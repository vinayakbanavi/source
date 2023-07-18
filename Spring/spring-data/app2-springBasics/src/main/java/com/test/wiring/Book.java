/*
 * Bean class : Book
 * Relation : Parent to Page
 * used to test autowire
 */

package com.test.wiring;

public class Book 
{
	private String title;
	private String author;
	
//	Constructor injection is preferred for mandatory fields
	
	public Book(String title, String author) 
	{
//		System.out.println("Container Instantiated book");
		this.title = title;
		this.author = author;
	}
	
//	Getters to access the fields 
//	fields : every one can access (cannot implement business logic)
//	getters : only those can access who satisfies the logic condition
	
	public String getTitle() 
	{
		return title;
	}
	
	public String getAuthor() 
	{
		return author;
	}	
}
