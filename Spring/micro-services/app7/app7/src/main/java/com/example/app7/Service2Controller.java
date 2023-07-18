package com.example.app7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller 
{
	@RequestMapping("service2")
	public String service2()
	{
		System.out.println("app7 service2 accessed");
		return "from service2";
	}
}
