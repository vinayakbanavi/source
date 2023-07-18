package com.example.securityapp1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@RequestMapping("hello")
	public String hello1()
	{
		return "Hello, There.";
	}
	
	@RequestMapping("test")
	public String  sayTest()
	{
		return "from test api";
	}
}
