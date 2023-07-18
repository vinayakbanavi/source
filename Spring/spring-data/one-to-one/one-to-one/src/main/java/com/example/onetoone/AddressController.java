package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController 
{
	@Autowired
	private AddressRepository repo;
	
	@RequestMapping("address/save")
	public Address save(@RequestBody Address address)
	{
		System.out.println("address saved");
		return repo.save(address);
	}
	
	@RequestMapping("address/read/{id}")
	public Address read(@PathVariable Integer id)
	{
		return repo.findById(id).get(); 
	}
	
//	return address by first name of the person
	@RequestMapping("address/read/{firstName}")
	public Iterable<Address> readByFirstName(@PathVariable String firstName)
	{
		return repo.readAddres(firstName);
	}
	
	@RequestMapping("address/readAll")
	public Iterable<Address> readAll()
	{
		return repo.findAll();
	}
	
	@RequestMapping("address/remove/{id}")
	public String remove(@PathVariable Integer id)
	{
		repo.deleteById(id);
		return id + "Address record removed";
	}
	
	@RequestMapping("address/removeAll")
	public String removeAll()
	{
		repo.deleteAll();
		return "All Address records removed";
	}
}
