package com.example.mapping3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository repo;
	
	public Student save(Student student)
	{
		return repo.save(student);
	}
	
	public Student findById(Integer id)
	{
		return repo.findById(id).get();
	}

	public Iterable<Student> findAll()
	{
		return repo.findAll();
	}
	
	public String deleteById(Integer id)
	{
		repo.deleteById(id);
		return id + " record deleted";
	}
	
	public String deleteAll()
	{
		repo.deleteAll();
		return "All records deleted";
	}
}
