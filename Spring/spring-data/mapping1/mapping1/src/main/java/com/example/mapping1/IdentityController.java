package com.example.mapping1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentityController 
{
	@Autowired
	private IdentityService service;
	
	@RequestMapping("identity/save")
	public Identity save(@RequestBody Identity id )
	{
		return service.save(id);
	}
	
	@RequestMapping("identity/readAll")
	public Iterable<Identity> readAll()
	{
		return service.findAll();
	}
}
