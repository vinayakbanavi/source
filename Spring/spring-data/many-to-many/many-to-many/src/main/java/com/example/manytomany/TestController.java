package com.example.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manytomany.subPack1.A;

@RestController
public class TestController 
{
	@Autowired
	Test obj1;
	
	@Autowired
	@Qualifier("cType")
//	we can explicitly Specify which Type of Object must assign through @Qualifier
	A obj2;
	
//	class A having Two subClass B & C
//	Both B & C extends A
//	Both B & C Are Component Class
	
//	Now Ambiguity in wiring obj2 
//	Field obj2 in com.example.manytomany.TestController required a single bean, but 2 were found:
	
//	Resolve 
//	1. Make any one Component class as Default
//	2. Anotating reference as A @Qualifier 
	
	@Autowired
	Environment environment; 
//	Environment is also Component 
	
	@RequestMapping("test")
	public String test()
	{
		System.out.println("Test object : " + obj1);
		System.out.println("A object : " + obj2);
		
		String s1 = environment.getProperty("server.port");
		return "success : " + s1;
	}
}
