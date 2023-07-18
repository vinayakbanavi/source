package com.example.jpacustomRepository;

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
	
//	Common Operations already defined in the CrudRepository
	
//	1. Save/ Update 
	
	@RequestMapping("person/save")
	public Person save(@RequestBody Person person)
	{
		return repo.save(person);
	}
	
//	2. Read
	
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
	
//	3. Delete
	
	@RequestMapping("person/delete/{id}")
	public String delete(@PathVariable Integer id)
	{
		repo.deleteById(id);
		return id + " record removed";
	}
	
	@RequestMapping("person/deleteAll")
	public String deleteAll()
	{
		repo.deleteAll();
		return "all records removed";
	}
	
//	Custom Repository methods
	
//	1. Return Person Records whose firstName matches given argument 
	@RequestMapping("person/readAll/{firstName}")
	public Iterable<Person> read1(@PathVariable String firstName)
	{
		return repo.findAllByFirstName(firstName);
	}	

//	2. Return Person Records whose lastName matches given argument 
	@RequestMapping("person/readAll/{lasttName}")
	public Iterable<Person> read2(@PathVariable String lasttName)
	{
		return repo.findAllByFirstName(lasttName);
	}	
	
//	3. Return Person Records Whose age matches given argument
	@RequestMapping("person/read/{age}")
	public Iterable<Person> read3(@PathVariable Integer age)
	{
		return repo.findAllByAge(age);
	}
	
//	4 Return Person Records whose email matches given argument
	@RequestMapping("person/readAll/{email}")
	public Person read4(@PathVariable String email)
	{
		return repo.findByEmail(email);
	}
	
//	5. Return Person Records whose age is Greater than given argument
	@RequestMapping("person/readAll/ageGreaterThan/{age}")
	public Iterable<Person> read5(@PathVariable Integer age)
	{
		return repo.findAllByAgeGreaterThan(age);
	}
	
//	6. Return Person Records whose age is Lesser than given argument
	@RequestMapping("person/readAll/ageLessThan/{age}")
	public Iterable<Person> read6(@PathVariable Integer age)
	{
		return repo.findAllByAgeLessThan(age);
	}
	
//	further we can create any number of custom API as and when required  
}