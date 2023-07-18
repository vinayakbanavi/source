package com.example.mapping2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService 
{
	@Autowired
	private PersonRepository repo;
	
	public Person save(Person person)
	{
		for(ContactInfo info : person.getContactInfo())
		{
			info.setPerson(person);
		}
		
		return repo.save(person);
	}
	
	public Iterable<Person> findAll()
	{
		return repo.findAll();
	}
}
