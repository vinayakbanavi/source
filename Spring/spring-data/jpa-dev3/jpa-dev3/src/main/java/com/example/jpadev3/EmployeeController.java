package com.example.jpadev3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeRepository er;
	
	@RequestMapping("saveEmployee")
	public Employee save(@RequestBody Employee emp)
	{
		return er.save(emp);
	}
}
