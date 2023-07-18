package com.example.practice2;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InputController3 
{
// Receiving JSON for RequestBody
	@RequestMapping("b1")
	public Person method1(@RequestBody Person person)
	{
		System.out.println("\nmethod1 accessed");
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAddress().getHouseNo());
		System.out.println(person.getAddress().getStreet());
		System.out.println(person.getAddress().getArea());
		System.out.println(person.getAddress().getCity());
		System.out.println(person.getAddress().getState());
		System.out.println(person.getAddress().getCountry());
		return person;
	}
	/*
	 * JSON body for b1 
 		{
		  "firstName": "Vinayak",
		  "lastName": "Banavi",
		  "age": 26,
		  "address": {
					    "houseNo": "123/A",
					    "street": "2nd Street",
					    "area": "BTM",
					    "city": "Bengaluru"
		  		     }
	    }
	 */
	
	@RequestMapping("b2")
	public Student method2(@RequestBody Student student)
	{
		System.out.println("\nmethod2 accessed");
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		return student;
	}
	
	/*
	 * JSON body for b2
 		{
		  "firstName": "Vinayak",
		  "lastName": "Banavi",
	    }
	 */

}
