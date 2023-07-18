package com.example.mapping2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactInfoService
{
	@Autowired
	private ContactInfoRepository repo;
	
	public ContactInfo save(ContactInfo info)
	{
		return repo.save(info);
	}
	
	public Iterable<ContactInfo> findAll()
	{
		return repo.findAll();
	}
}
