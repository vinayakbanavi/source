package com.test.beanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Printer 
{
	public static void main(String[] args) 
	{
//		Creating Spring Container by applying Metadata
		ApplicationContext container = new ClassPathXmlApplicationContext("inheritanceConfig.xml");
		
//		printer1 (message1, message2)
		{
			Printer1 p1 = container.getBean("printer1", Printer1.class);
			System.out.println("Printer1 Working");
			System.out.println(p1.getMessage1());
			System.out.println(p1.getMessage2());
		}
		
//		printer2 (message1, message2, message3)
		{
			System.out.println("\nPrinter2 Working");
			Printer2 p2 = container.getBean("printer2", Printer2.class);
			System.out.println(p2.getMessage1());
			System.out.println(p2.getMessage2());
			System.out.println(p2.getMessage3());
		}
		
//		beanTemplate
//		if multiple beans having same property we can inject them with the same value by inheriting
//		abstract template bean
		{
			System.out.println("\nPrinter1 bean inheriting templatebean");
			Printer1 p1 = container.getBean("print1", Printer1.class);
			System.out.println(p1.getMessage1());
			System.out.println(p1.getMessage2());
			
			System.out.println("\nPrinter2 bean inheriting templatebean");
			Printer2 p2 = container.getBean("print2", Printer2.class);
			System.out.println(p2.getMessage1());
			System.out.println(p2.getMessage2());
			System.out.println(p2.getMessage3());
			
//			container.registerShutdownHook(); is available is ClassPathXmlApplicationContext only
		}
		
	}
}
