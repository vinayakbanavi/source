package com.example.jpadev2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController
{
//	@Autowired will request framework to provide an object to the particular attribute
//	framework will develop a subclass to the interface and develop a object inside it and assign it to the variable
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping("save")
	public Person save(@RequestBody Person person)
	{
		return personRepository.save(person);
	}
}
