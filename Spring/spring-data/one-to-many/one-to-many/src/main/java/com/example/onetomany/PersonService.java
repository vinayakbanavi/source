 package com.example.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// Service Class must be Annotated with @Service in order to make them available to Controllers
@Service
public class PersonService 
{	
	@Autowired
	private PersonRepository personRepository;
	
	public Person save(Person person)
	{
		for (MobileNumber number : person.getMobileNumber())
		{
			number.setPerson(person);
		}
		
		return personRepository.save(person);
	}
	
	public Iterable<Person>load()
	{
		return personRepository.findAll();
	}

}


/*
 		Service Class
 			1. Does not have any mappings
 			2. Controller ---> Service ---> Repository(database)
*/