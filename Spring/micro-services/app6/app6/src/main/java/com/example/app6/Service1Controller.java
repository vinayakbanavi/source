package com.example.app6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller 
{
	@Autowired
	private ProxyforApp7 proxy;
	
	@RequestMapping("service1")
	public String service1()
	{
		String service2 = proxy.service2(); 
		return "from service1 , " + service2;
	}
}
