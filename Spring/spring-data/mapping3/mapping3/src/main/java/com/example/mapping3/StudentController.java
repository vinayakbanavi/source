package com.example.mapping3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	@RequestMapping("student/save")
	public Student save(@RequestBody Student student)
	{
		return service.save(student);
	}
	
	@RequestMapping("student/read/{id}")
	public Student findById(@PathVariable Integer id)
	{
		return service.findById(id);
	}

	@RequestMapping("student/readAll")
	public Iterable<Student> findAll()
	{
		return service.findAll();
	}
	
	@RequestMapping("student/delete/{id}")
	public String delete(@PathVariable Integer id)
	{
		return service.deleteById(id);
	}
	
	@RequestMapping("student/deleteAll")
	public String deleteAll()
	{
		return service.deleteAll();
	}
}
