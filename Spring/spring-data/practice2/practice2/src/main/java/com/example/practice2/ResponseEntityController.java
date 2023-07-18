/*
 		Response Entity represents Whole HTTP response : status code, headers and body
 		
 		Response Entity is used to set the 
 			1. Headers
 			2. Body
 			3. Status
 			
 */

package com.example.practice2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseEntityController 
{
//	Response Entity is a generic type we can make any type as the response body
//	We can customize the HTTP response depending on the requirement
//	Usually we can't see these response in the browser we need to observe this in ARC
	
	@RequestMapping("response1")
	public ResponseEntity<String> response1()
	{
		System.out.println("response1 accessed");
		return new ResponseEntity<String>("hello", HttpStatus.OK);
//		                          generic   body , status
//	   	Sending a response using a constructor.
	}
	
	@RequestMapping("response2")
	public ResponseEntity<Integer> reponse2()
	{
		System.out.println("response2 accessed");
		return new ResponseEntity<Integer>(12, HttpStatus.BAD_REQUEST);
	}
	
//	Derived 
	@RequestMapping("response3")
	public ResponseEntity<Student> response3()
	{
		System.out.println("response3 accessed");
		Student s1 = new Student();
		s1.setId("101");
		s1.setFirstName("Vinayak");
		s1.setLastName("Banavi");
		return new ResponseEntity<Student>(s1, HttpStatus.OK);
	}
	
	@RequestMapping("response4")
	public ResponseEntity<List<String>> response4()
	{
		List<String> list = new ArrayList<>();
		list.add("Pacifist");
		list.add("Black");
		list.add("native");
		
		return new ResponseEntity<List<String>>(list, HttpStatus.OK);
	}
	
//	Scenarios where we required ResponseEntity
	@RequestMapping("response5/{yob}")
	public ResponseEntity<String> response5(@PathVariable Integer yob)
	{
		if(yob >= 2023)
		{
			return new ResponseEntity<String>("Year of birth should not be greater than current year", HttpStatus.BAD_REQUEST);
		}
		else
		{
			return new ResponseEntity<String>("Your age is : " + (2023 - yob) , HttpStatus.OK);
		}
	}
	
//	ResponseEntity using internal  Methods
	
	@RequestMapping("response6/{yearOfBirth}")
	public ResponseEntity<String> response6(@PathVariable Integer yearOfBirth)
	{
		ResponseEntity<String> response = null;
		
		if(yearOfBirth >= 2023)
		{
			response = ResponseEntity.badRequest().body("Year of birth should not be greater than current year");
		}
		else
		{
			response = ResponseEntity.ok().body("Your age is : " + (2023 - yearOfBirth));
		}
		
		return response;
	}
	
//	HTML based
	
	@RequestMapping("response7")
	public ResponseEntity<String> response7()
	{
		return ResponseEntity.ok().body("<h1>ResponseEntity.ok().body()</h1>");
	}
	
//	Headers
	
	@RequestMapping("response8")
	public ResponseEntity<String> reponse8()
	{
		return ResponseEntity.ok()
							 .header("content-type", "text/plain")
							 .body("<h1>ResponseEntity.ok().body()</h1>");
	}
	
	@RequestMapping("response9")
	public ResponseEntity<String> response9()
	{
		return ResponseEntity.ok()
							 .header("content-type", "text/html")
							 .body("<h1 style = \"color:green \">ResponseEntity.ok().body()</h1>");
	}
}
