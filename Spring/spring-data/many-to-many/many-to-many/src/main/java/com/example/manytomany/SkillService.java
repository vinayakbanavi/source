package com.example.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService 
{
	@Autowired
	private SkillRepository skillRepo;
	
	public Skill save(Skill skill)
	{
		return skillRepo.save(skill);
	}
	
	public Iterable<Skill> findAll()
	{
		return skillRepo.findAll();
	}
}
