package com.example.jpadev4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeRepository repo;
	
	@RequestMapping("emp/save")
	public Employee save(@RequestBody Employee employee)
	{
		System.out.println("employee data saved");
		return repo.save(employee);
	}
	
	@RequestMapping("emp/load")
	public Iterable<Employee> load()
	{
		System.out.println("employee load");
		return repo.findAll();
	}
	
	@RequestMapping("emp/load/{empId}")
	public Employee load(@PathVariable Integer empId)
	{
		System.out.println("employee load");
		return repo.findById(empId).get();
	}
}
