package com.example.jpadev2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping("saveStudent")
	public Student save(@RequestBody Student student)
	{
		return studentRepository.save(student);
	}
}
