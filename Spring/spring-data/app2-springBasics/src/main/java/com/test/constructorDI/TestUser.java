package com.test.constructorDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser 
{
	
	public static void main(String[] args) 
	{
/**
 * 		Constructor Injection
 *		check User and beans.xml
 */
		System.out.println("Constructor Injecton");
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("userConfig.xml");
//		All the objects will create while creating the new IOC
		
		User user1 = container.getBean("u1", User.class);
		
		System.out.println("\nuser1");
		System.out.println(user1.getUserId());
		System.out.println(user1.getUserName());
		
		User user2 = container.getBean("u2", User.class);
		
		System.out.println("\nuser2");
		System.out.println(user2.getUserId());
		System.out.println(user2.getUserName());
	}
}
