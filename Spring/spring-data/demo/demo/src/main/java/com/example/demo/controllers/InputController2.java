package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InputController2 
{
//	using request param we dont need to specify seperate placeholder
	
	@RequestMapping("param1")
	public String method1(@RequestParam String firstName, @RequestParam String lastName)
	{
		return "User Details : FirstName = " + firstName + ", LastName = " + lastName; 
	}
	
	@RequestMapping("param2")
	public String method2(@RequestParam(required = false) String input)
	{
		return "user input : " + input;
	}
}
