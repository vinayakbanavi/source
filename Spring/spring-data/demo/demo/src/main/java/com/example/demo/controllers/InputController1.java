package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;

@RestController
public class InputController1 
{
//	urn must be unique even though they are having different placeholder
	@RequestMapping("input1/{firstName}")
	public String method1(@PathVariable String firstName)
	{
		return "Your name is : " + firstName;
	}
	
	@RequestMapping("input2/{age}")
	public String method2(@PathVariable int age)
	{
		return "Your age : " + age;
	}
	
//	the request will trigger the method but while triggering 
//	if placeholder is not available for the Corresponding Path Variable
//	argument cannot be passed 
//	SO will get internal server error 500
	@RequestMapping("input3")
	public String method3(@PathVariable String arg)
	{
		return "No PathHolder";
	}
	
//	if argument name and pathholder name are not same 
//	we must explicitly provide the corresponding name to pathvariable
//	@PathVariable(name = "") or @PathVariable(value = "") or PathVariable(""); all are same
	
	@RequestMapping("input4/{input}")
	public String method4(@PathVariable(name = "input") String name)
	{
		return "Your name is : " + name;
	}
	
//	By default required = true 
//	if we dont provide the value to the Pathholder we will get 404 not found error
	
//	overloading urn
	
	@RequestMapping("input5/{input}")
	public String method5(@PathVariable String input)
	{
		return "user input : " + input;
	}
	
	@RequestMapping("input5")
	public String method5a()
	{
		return "please enter the inout";
	}
	
	@RequestMapping("input6/{input}")
	public String method6(@PathVariable(required = false) String input)
	{
		return "User input : " + input;
	}
}
