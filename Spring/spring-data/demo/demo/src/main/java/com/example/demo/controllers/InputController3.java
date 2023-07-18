package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.*;

@RestController
public class InputController3 
{
//	java Objects can be recieved in the format of JSON 
//	JavaScript Object notation
	
	@RequestMapping("savePerson")
	public Person method1(@RequestBody Person person)
	{
		System.out.println("savePerson accessed");
		return person;
	}
	
}
