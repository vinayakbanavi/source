package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController 
{
	@Autowired
	private PersonRepository repo;
	
	@RequestMapping("person/save")
	public Person save1(@RequestBody Person person)
	{
		
		System.out.println("person saved");
		
//		Modifying the API to mapp the parent record with child record
		
		person.getAddress().setPerson(person);
		return repo.save(person); 
	}
	
	@RequestMapping("person/read/{id}")
	public Person read(@PathVariable Integer id)
	{
		return repo.findById(id).get();
	}

	@RequestMapping("person/readAll")
	public Iterable<Person> readAll()
	{
		return repo.findAll();
	}
	
	@RequestMapping("person/removeAll")
	public String removeAll()
	{
		repo.deleteAll();
		return "All records removed";
	}
	
	@RequestMapping("person/remove/{id}")
	public String remove(@PathVariable Integer id)
	{
		repo.deleteById(id);
		return id + " record removed";
	}
	
	
}
