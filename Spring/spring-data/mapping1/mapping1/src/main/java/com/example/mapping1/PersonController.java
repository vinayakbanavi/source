package com.example.mapping1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController 
{
	@Autowired
	private PersonService service;
	
	@RequestMapping("person/save")
	public Person save(@RequestBody Person person)
	{
		return service.save(person);
	}
	
	@RequestMapping("person/readAll")
	public Iterable<Person> readAll()
	{
		return service.findAll();
	}
}
