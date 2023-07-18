/*
 * Bean class : Computer
 * Injecting Inner Beans
 */

package com.test.innerBeanDI;

public class Computer 
{
	private Printer printer;
	private String message;
	
	Computer()
	{
		System.out.println("Computer instantiated by the Container");
	}
	
	public Printer getPrint() 
	{
		return printer;
	}
	
	public void setPrinter(Printer printer) 
	{
		this.printer = printer;
	}
	
	public String getMessage() 
	{
		return message;
	}
	
	public void setMessage(String message) 
	{
		this.message = message;
	}
	
	public void print()
	{
		printer.print(message);
	}
}
