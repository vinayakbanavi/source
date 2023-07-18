package com.example.jpadev5;

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
	public Employee save(@RequestBody Employee emp)
	{
		System.out.println("Employee saved");
		return repo.save(emp);
	}
	
	@RequestMapping("emp/load")
	public Iterable<Employee> load()
	{
		System.out.println("Employee loaded");
		return repo.findAll();
	}
	
	@RequestMapping("emp/load/{empId}")
	public Employee load(@PathVariable String empId)
	{
		return repo.findById(empId).get();
	}
	
	@RequestMapping("emp/delete")
	public String delete()
	{
		System.out.println("All records Removed" );
		repo.deleteAll();
		return "All records deleted";
	}
	
	@RequestMapping("emp/delete/{empId}")
	public String delete(@PathVariable String empId)
	{
		System.out.println("empId : " + empId + " Removed from the record" );
		repo.deleteById(empId);
		return empId;
	} 
}
