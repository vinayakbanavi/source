package com.example.app13;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller 
{
	@RequestMapping("service2")
	public String service1()
	{
		return "from service2" + this;
	}
}
