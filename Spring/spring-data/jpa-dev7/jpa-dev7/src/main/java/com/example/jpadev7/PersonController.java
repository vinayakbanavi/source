package com.example.jpadev7;

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
	public Person save(@RequestBody Person p1)
	{
		System.out.println("save accessed");
		return repo.save(p1);
	}
	
	@RequestMapping("person/read/{id}")
	public Person read(@PathVariable Integer id)
	{
		return repo.findById(id).get();
	}
	
	@RequestMapping("person/read/email/{email}")
	public Person readByEmail(@PathVariable String email)
	{
		return repo.findByEmail(email);
	}
	
	@RequestMapping("person/readAll")
	public Iterable<Person> readAll()
	{
		return repo.findAll();
	}
	
	@RequestMapping("person/readAll/firstName/{firstName}")
	public Iterable<Person> readAllByFirstName(@PathVariable String firstName)
	{
		return repo.findAllByFirstName(firstName);
	}
	
	@RequestMapping("person/readAll/lastName/{lastName}")
	public Iterable<Person> readAllByLastName(@PathVariable String lastName)
	{
		return repo.findAllByLastName(lastName);
	}
	
	@RequestMapping("person/readAll/firstName/{firstName}/lastName/{lastName}")
	public Iterable<Person> readAllByFirstNameOrLastName(@PathVariable String firstName,
														 @PathVariable String lastName)
	{
		return repo.findAllByFirstNameOrLastName(firstName, lastName);
	}

	@RequestMapping("person/read/firstName/{firstName}/lastName/{lastName}")
	public Iterable<Person> readAllByFirstNameAndLastName(@PathVariable String firstName,
			@PathVariable String lastName)
	{
		return repo.findAllByFirstNameAndLastName(firstName, lastName);
	}
	
	@RequestMapping("person/readAll/firstName/like/{firstName}")
	public Iterable<Person> readAllByFirstNameLike(@PathVariable String firstName)
	{
		return repo.findAllByFirstNameLike("%" + firstName + "%");
	}
	
	@RequestMapping("person/readAll/age/{age}")
	public Iterable<Person> readAllByAge(@PathVariable Integer age)
	{
		return repo.findAllByAge(age);
	}
	
	@RequestMapping("person/readAll/age/greater/{age}")
	public Iterable<Person> readAllByAgeGreater(@PathVariable Integer age)
	{
		return repo.findAllByAgeGreaterThan(age);
	}
	
	
	@RequestMapping("person/readAll/age/Lesser/{age}")
	public Iterable<Person> readAllByAgeLesser(@PathVariable Integer age)
	{
		return repo.findAllByAgeLessThan(age);
	}

	@RequestMapping("person/removeAll")
	public String removeAll()
	{
		repo.deleteAll();
		return "All records removed";
	}
	
	@RequestMapping("person/remove")
	public String remove(@PathVariable Integer id)
	{
		repo.deleteById(id);
		return "id : " + id +  " record removed";
	}
	
//	custom api with Queries
	
	@RequestMapping("person/read1/email/{email}")
	public String readFirstNameByEmail(@PathVariable String email)
	{
		return repo.read1(email);
	}
	
	@RequestMapping("person/read2/email/{email}")
	public String read2(@PathVariable String email)
	{
		return repo.read2(email);
	}
	
	@RequestMapping("person/read3/email/{email}")
	public String read3(@PathVariable String email)
	{
		return repo.read3(email);
	}
	
	@RequestMapping("person/read4/age/{age}")
	public Iterable<String> read4(@PathVariable Integer age)
	{
		return repo.read4(age);
	}
	
	@RequestMapping("person/read5")
	public Iterable<String[]> read5()
	{
		return repo.read5();
	}
	
	@RequestMapping("person/read6")
	public Iterable<Person> read6()
	{
		return repo.read6();
	}
	
//	returns Person Object
	@RequestMapping("person/read7/id/{id}")
	public Iterable<Person> read7(@PathVariable Integer id)
	{
		return repo.read7(id);
	}
	
//	returns age
	@RequestMapping("person/read8/id/{id}/firstName/{firstName}")
	public Iterable<Integer> read8(@PathVariable Integer id,
								   @PathVariable String firstName)
	{
		return repo.read8(id, firstName);
	}
	
//	returns age , email array for each compatible record
	@RequestMapping("person/read9/id/{id}/firstName/{firstName}")
	public Iterable<Object[]> read9(@PathVariable Integer id,
									@PathVariable String firstName)
	{
		return repo.read9(id, firstName);
	}
	
//	return all Person records
	@RequestMapping("person/read10")
	public Iterable<Person> read10()
	{
		return repo.read10();
	}
	
//	return person whose firstName matches the argument
	@RequestMapping("person/read11/firstName/{firstName}")
	public Iterable<Person> read11(@PathVariable String firstName)
	{
		return repo.read11(firstName);
	}
	
//	return firstName and lastName  
	@RequestMapping("person/read12")
	public Iterable<String> read12()
	{
		return repo.read12();
	}
	
//	return only lastName
	@RequestMapping("person/read13")
	public Iterable<String> read13()
	{
		return repo.read13();
	}
	
	@RequestMapping("person/read14")
	public Iterable<PersonDTO> read14()
	{
		return repo.read14();
	}
}




