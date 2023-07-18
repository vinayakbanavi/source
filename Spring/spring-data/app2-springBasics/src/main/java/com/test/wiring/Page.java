/*
 * Bean class : Page
 * Relation Child to Book
 */

package com.test.wiring;

public class Page 
{	
	private String header;
	private String body;
	private String footer;
	
	private Book book;
	
	public Book getBook()
	{
		return book;
	}

	public void setBook(Book book) 
	{
		this.book = book;
	}

	Page()
	{
		System.out.println("Container Instantiated Page");
	}
	
	public String getHeader() 
	{
		return header;
	}
	
	public void setHeader(String header) 
	{
		this.header = header;
	}
	
	public String getBody() 
	{
		return body;
	}
	
	public void setBody(String body) 
	{
		this.body = body;
	}
	
	public String getFooter() 
	{
		return footer;
	}
	
	public void setFooter(String footer)
	{
		this.footer = footer;
	}
}
