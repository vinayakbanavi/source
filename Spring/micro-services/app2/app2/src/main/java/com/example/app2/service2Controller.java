package com.example.app2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class service2Controller 
{
	@RequestMapping("service2")
	public String service2()
	{
		System.out.println("service2 accessed");
		return "from service2";
	}
}
