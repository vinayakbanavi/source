package com.example.practice2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InputController2 
{
//	for RequestParam we dont need to provide separate place holder in the url
	
	@RequestMapping("userInput1")   //http://localhost:9090/userInput1?firstName=Vinayak
	public String method1( @RequestParam String firstName)
	{
		System.out.println("method1 accessesd");
		return firstName;
	}
	
//	if we dont supply value to the parameters we will get 404 error
//	we can avoid it by changing required
//	we can also supply values
	
	@RequestMapping("userInput2")   
//	 http://localhost:9090/userInput2
//	http://localhost:9090/userInput2?firstName=abc
	public String method2(@RequestParam(required = false) String firstName)
	{
		System.out.println("method2 accessed");
		return firstName;
	}
	
//	we can also give different name for RequestParam
//	@RequestParam("input") , @RequestParam(name = "input") and @RequestParam(value = "input") all are same
	
	@RequestMapping("userInput3")
	public String method3(@RequestParam("input") String arg) // http://localhost:9090/userInput3?input=hello
	{
		System.out.println("method3 accessed");
		return arg;
	}
	
//	multiple inputs can be received 
//	each arg must be mapped with RequestParam
//	http://localhost:9090/userInput4?firstName=Vinayak&lastName=Banavi&age=26
	@RequestMapping("userInput4")
	public String method4(@RequestParam String firstName,
			              @RequestParam String lastName,
			              @RequestParam int age)
	{
		System.out.println("method4 accessed");
		return firstName + ", " + lastName + ", " + age;
	}
	
	
//	next input type is Object we can't receive Objects through Browser URL
//	we have to receive body through JSON, XML
//	JSON java script object notation
//	we have to use Advanced Rest Client to send JSON
}
 