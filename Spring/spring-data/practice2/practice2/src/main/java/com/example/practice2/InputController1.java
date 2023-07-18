package com.example.practice2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InputController1 
{
	@RequestMapping("input")
	public String input(String s1)
	{
		System.out.println("input accessed");
		return "You entered : " + s1;
	}
	
	
//	PathVariable must be mapped with the argument to receive inputs from the browser url
//	Placeholder should be used in the url for receiving the PathVariable
//	argument mapped with PathVariable and placeholder name must be same
	
	@RequestMapping("input1/{variable}")
	public String input1(@PathVariable String variable)
	{
		System.out.println("input1 accessed");
		return variable;
	}
	
//	if not same we must tag the value explicitly along with PathVariable
	
	@RequestMapping("input2/{variable}")
	public String input2(@PathVariable(value = "variable") String firstName)
	{
		System.out.println("input2 accessed");
		return firstName;
	}
	
//	or just like below
//	both @PathVariable(name = "variable") , @PathVariable(value = "variable") & @PathVariable("variable") are same
	
	@RequestMapping("input3/{variable}")
	public String input3(@PathVariable("variable") String arg)
	{
		System.out.println("input3 accessed");
		return arg;
	}
	
//	if we dont supply input to the placeholder we get error
//	we can overload such api for no input
//	by choosing same url and No PathVariable or PathVariable with required = false
	
	@RequestMapping("input3")
	public String  input3a(String arg)
	{
		System.out.println("input3a accessed");
		return arg;
	}
	
//	by default required will be true for PathVariable
//  by changing it to false we can avoid exception
	
	@RequestMapping("input4")
	public String input4(@PathVariable(required = false) String arg)
	{
		System.out.println("input4 accessed");
		return arg;
	}
	
//	for every PathVariable with default required there has to be a placeholder if we don't provide
//	we will get 500 error
	
	@RequestMapping("input5")
	public String input5(@PathVariable String arg)
	{
		System.out.println("input5 accessed");
		return arg;
	}
	
//	we can receive multiple inputs 
//	every input arg must be mapped with PathVariable and specific placeholder must be provided
//	order can be different from the argument order like 	@RequestMapping("input6/{firstName}/{age}/{lastName}")
	
	@RequestMapping("input6/{firstName}/{lastName}/{age}")
	public String input6(@PathVariable String firstName,
						 @PathVariable String lastName,
						 @PathVariable int age)
	{
		System.out.println("input6 accessed");
		return firstName + ", " + lastName + ", " + age;
	}
	
//	we can also provide specific tag before placeholder in the url
	
	@RequestMapping("input7/firstName/{firstName}/lastName/{lastName}/age/{age}")
	public String input7(@PathVariable String firstName,
			             @PathVariable String lastName,
			             @PathVariable int age)
	{
		System.out.println("input7 accessed");
		return firstName + ", " + lastName + ", " + age;
	}
	
//	Apart from PathVariable we can receive inputs through ReuestParam
}
