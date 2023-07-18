package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
	@RequestMapping("h1")         // method and mapping can have different names
	public String hello1()
	{
		System.out.println("hello1 acessed");
		return "Hello there?";
	}
	
	@RequestMapping("h2/{arg}")   // arg of pathvariable and requestmapping should be same
	public String hello2(@PathVariable String arg)
	{
		System.out.println("hello2 acessed");
		return "This is your value : " + arg;
	}
	
	@RequestMapping("h3/{input}")
	public String hello3(@PathVariable String input)
	{
		System.out.println("hello2 acessed");
		return "Entered input : " + input;
	}
	
	@RequestMapping("h4/{input}") // if placeholder and argument are different 
	public String hello4(@PathVariable("input") String s1) // we need to specify the placeholder explicitly
	{
		System.out.println("hello4 acessed");
		return "Entered input : " + s1;
	}
	
	@RequestMapping("h5/{firstName}")
	public String hello5(@PathVariable("firstName") String firstName)
	{
		System.out.println("hello5 firstName acessed : " + firstName);
		return "first name : " + firstName;
	}
//	path variable URL must be different but placeholder must be same
	@RequestMapping("h6/{firstName}")  
	public String hello6(@PathVariable("firstName") String firstName)
	{
		System.out.println("hello6 firstName acessed : " + firstName);
		return "first name : " + firstName;
	}
	
	@RequestMapping("h7/{firstName}")
	public String hello7(@PathVariable("firstName") String firstName)
	{
		System.out.println("hello7 firstName acessed :  " + firstName);
		return "first name : " + firstName;
	}
	
	@RequestMapping("h8/{firstName}/{lastName}")
	public String hello8(@PathVariable("firstName") String firstName, @PathVariable String lastName)
	{
		System.out.println("hello7 acessed "+ firstName + ", " + lastName);
		return "You have entered : "+ firstName + " " + lastName;
	}
	
	@RequestMapping("h9/firstName/{firstName}/lastName/{lastName}/age/{age}")
	public String hello9(@PathVariable String firstName,
			             @PathVariable String lastName,
			             @PathVariable int age)
	{
		System.out.println("from hello9 : " + firstName + ", " + lastName + ", " + age );
		return "You entered : " + firstName + ", " + lastName + ", " + age;
	}
	
	@RequestMapping("h10/{firstName}/{lastName}/{age}")
	public String hello10(@PathVariable String firstName,
					      @PathVariable String lastName,
						  @PathVariable int age)
	{
		System.out.println("from hello10 : " + firstName + ", " + lastName + ", " + age );
		return "You entered : " + firstName + ", " + lastName + ", " + age;
	}
	
	@GetMapping("h11/{s1}")
	public String test11(@PathVariable String s1)
	{
		System.out.println("test11 acessed");
		return "You entered : " + s1;
	}
	
//	@GetMapping("h11") also works
	@RequestMapping("h11")
//	 URL can be same for API with path variable and API without path variable
	public String test112()
	{
		System.out.println("test12");
		return "You entered : ";
	}
	
	@RequestMapping("h12")
//	if @pathVariable is used, mapping must have place holder and receive parameters
//	MissingPathVariableException: Required URI template variable 's1' for method parameter type String is not present]
	public String test12(@PathVariable String s1)
	{
		System.out.println("test12 accessed");
		return "You entered : " + s1;
	}
	
	@RequestMapping("h13")
	public String test13(@PathVariable(required = false) String s1)
	{
		System.out.println("test13 accessed");
		return "You entered : " + s1;
	}
	
	@RequestMapping("h14/{abc}")
//	@PathVariable(value = "abc")  and @PathVariable("abc") are same
	public String test14(@PathVariable(value = "abc") String s1)
	{
		System.out.println("test14 accessed");
		return "You entered : " + s1;
	}
}

//404 no parameter supplied for the placeholder 
//500 placeholder not available for the specified PathVariable

//properties of the PathVariable 
//	1. name
//  2. required = false - to make argument as an optional
//  3. value