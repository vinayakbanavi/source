package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.*;

@RestController
public class RequestController 
{
//	An API can be composed by a java function
//	Annotated with mapping("urn")
	
//	"urn" must be unique across the application/ port
//	no two API can have same URN (Unified Resource Name)
	
//	An API can return any data type (primitive / derived)
	
	@RequestMapping("returnVoid")
	public void method1()
	{
//		web browser will show blank for void
	}
	
	@RequestMapping("returnInt")
	public int method2()
	{
		return 100; 
	}
	
	@RequestMapping("returnDouble")
	public double method3()
	{
		return 55.55;
	}
	
	@RequestMapping("returnChar")
	public char method4()
	{
		return 'X';
	}
	
	@RequestMapping("returnBoolean")
	public boolean method5()
	{
		return false;
	}
	
//	return Arrays
	
	@RequestMapping("returnIntArray")
	public int[] method6()
	{
		int[] array = {1,2,3,4,5};
		return array;
	}
	
	@RequestMapping("returnStringArray")
	public String[] method7()
	{
		String[] array = {"hii", "hello", "how", "are"};
		return array;
	}
	
//	Return Objects
	
	@RequestMapping("returnPerson")
	public Person method8()
	{
		Person person = new Person();
		person.setFirstName("Vinayak");
		person.setLastName("Banavi");
		
		return person;
	}
	
	@RequestMapping("returnUser")
	public User method9()
	{
		User user = new User();
		user.setUserName("vinayakbanavi");
		user.setPassword("Hacker#123");
		
		ContactInfo info = new ContactInfo();
		info.setContactNo(8553136080L);
		info.setEmail("vinayakbanavi@gmail.com");
		
		user.setInfo(info);
		
		return user;
	}
	
//	return Collection objects
	
	@RequestMapping("returnListOfString")
	public List<String> method10()
	{
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("how");
		list.add("hey");
		
		return list;
	}
	
	@RequestMapping("returnListOfPerson")
	public List<Person> method11()
	{
		List<Person> list = new ArrayList<>();
		Person p1 = new Person("Akash" , "kumar");
		Person p2 = new Person("Abhimanyu" , "Singh");
		Person p3 = new Person("Siddarth" , "Shukla");
		Person p4 = new Person("Preetham" , "Gubbi");
		Person p5 = new Person("Pannagha" , "Bharana");
		Person p6 = new Person("Chandra" , "Mouli");
		return list;
	}
}
