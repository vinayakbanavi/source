package com.test.innerBeanDI;

public class Printer 
{
	Printer()
	{
		System.out.println("Printer Instantiated by the Container");
	}
	
	public void print(String message)
	{
		System.out.println("Printer printing : " + message);
	}
}
