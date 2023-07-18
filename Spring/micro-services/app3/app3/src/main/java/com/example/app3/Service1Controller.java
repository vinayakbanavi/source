package com.example.app3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller 
{
	@Autowired
	private ProxyforApp4 proxy;
	
	@RequestMapping("service1")
	public String service1()
	{
		System.out.println("service1 accessed");
		String results = proxy.test1();
		return "from service1 " + results ;
	}
}
