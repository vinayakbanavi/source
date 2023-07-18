/*
 		Service Class:
 			Acts as a Intermediary layer between Repository and Controller
 			Adds on Extra security
 			Service Class Doesn't contain Mappings
 			Service class must be annotated with @Service to be available to Controller 
 			
 			Controller -----> Service --------> Repository
 */


package com.example.mapping1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentityService 
{
	@Autowired
	private IdentityRepository repo;
	
	public Identity save(Identity id)
	{
		return repo.save(id);
	}
	
	public Iterable<Identity> findAll()
	{
		return repo.findAll();
	}
}
