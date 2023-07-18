package com.example.mapping3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController 
{
	@Autowired
	private SkillService service;
	
	@RequestMapping("skill/save")
	public Skill save(@RequestBody Skill skill)
	{
		return service.save(skill);
	}
	
	@RequestMapping("skill/read/{id}")
	public Skill findById(@PathVariable Integer id)
	{
		return service.findById(id);
	}
	
	@RequestMapping("skill/readAll")
	public Iterable<Skill> findAll()
	{
		return service.findAll();
	}
	
	@RequestMapping("skill/delete/{id}")
	public String deleteById(@PathVariable Integer id)
	{
		return service.deleteById(id);
	}
	
	@RequestMapping("skill/deleteAll")
	public String deleteAll()
	{
		return service.deleteAll();
	}
}
