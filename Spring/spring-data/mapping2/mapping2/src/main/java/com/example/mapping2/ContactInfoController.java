package com.example.mapping2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactInfoController 
{
	@Autowired
	private ContactInfoService service;
	
	@RequestMapping("contact/save")
	public ContactInfo save(@RequestBody ContactInfo info)
	{
		return service.save(info);
	}
	
	@RequestMapping("contact/readAll")
	public Iterable<ContactInfo> readAll()
	{
		return service.findAll();
	}
}
