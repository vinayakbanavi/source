package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Person;

@RestController
public class ResponseEntityController 
{
// ResponseEntity is composed of HTTP status, Header, Body
//	Can be used to send custom response
//	We can set response through Constructor or Method
	
	@RequestMapping("response1")
	public ResponseEntity<String> response1()
	{
		return new ResponseEntity<String>("Body is generic", HttpStatus.OK);
	}
	
	
	@RequestMapping("response2")
	public ResponseEntity<String> response2(@RequestParam int yob)
	{
		if (yob >= 2023)
		{
			return ResponseEntity.badRequest().body("age cannot be 0");
		}
		else
		{
			return ResponseEntity.ok().body("your age is : " + (2023 - yob));
		}
	}
	
	@RequestMapping("response3")
	public ResponseEntity<Person> response3()
	{
		Person p1 = new Person();
		p1.setFirstName("Vinayak");
		p1.setLastName("Banavi");
		
		return new ResponseEntity(p1, HttpStatus.OK);
	}
	
	@RequestMapping("response4")
	public ResponseEntity<Person> response4()
	{
		Person p1 = new Person();
		p1.setFirstName("Vinayak");
		p1.setLastName("Banavi");
		
		return ResponseEntity.ok().body(p1);
//		body method argument is of E type(generic)
	}
	
//	HTML
	
	@RequestMapping("response5")
	public ResponseEntity<String> response5()
	{
		return ResponseEntity.ok().header("content-type", "text/plain").body("<h1>I am inside h1</h1>");
	}
	@RequestMapping("response6")
	public ResponseEntity<String> response6()
	{
		return ResponseEntity.ok().header("content-type", "text/html").body("<h1>I am inside h1</h1>");
	}
}
