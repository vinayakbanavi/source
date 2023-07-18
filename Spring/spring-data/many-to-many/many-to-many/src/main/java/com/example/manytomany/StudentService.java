package com.example.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// if a class is Annotated as @Service internally it is also Annotated as @Component 
@Service
public class StudentService 
{
	@Autowired
	private StudentRepository studentRepo;
	
	public Student save(Student student)
	{
		return studentRepo.save(student);
	}
	
	public Iterable<Student> findAll()
	{
		return studentRepo.findAll();
	}
}
