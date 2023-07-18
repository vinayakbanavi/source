package com.example.mapping3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService 
{
	@Autowired
	private SkillRepository repo;
	
	public Skill save(Skill skill)
	{
		return repo.save(skill);
	}
	
	public Skill findById(Integer id)
	{
		return repo.findById(id).get();
	}
	
	public Iterable<Skill> findAll()
	{
		return repo.findAll();
	}
	
	public String deleteById(Integer id)
	{
		repo.deleteById(id);
		return id + "record deleted";
	}
	
	public String deleteAll()
	{
		repo.deleteAll();
		return "all records deleted";
	}
}
