package com.example.jpadev;

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
	public Person save(@RequestBody Person person)
	{
		return repo.save(person);
	}
	
	@RequestMapping("person/load")
	public Iterable<Person> load()
	{
		return repo.findAll();
	}
	
	@RequestMapping("person/load/{id}")
	public Person load(@PathVariable int id)
	{
		return repo.findById(id).get();
	}
	
	@RequestMapping("person/delete")
	public String delete()
	{
		repo.deleteAll();
		return "all records removed";
	}
	
	@RequestMapping("person/delete/{id}")
	public String delete(@PathVariable int id)
	{
		repo.deleteById(id);
		return id + " record removed";
	}
}
