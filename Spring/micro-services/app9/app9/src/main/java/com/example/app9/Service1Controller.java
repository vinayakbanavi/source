package com.example.app9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller 
{
	@Autowired
	private ProxyForApp10 proxy;
	
	@RequestMapping("service1")
	public String service1()
	{
		System.out.println("service1 accessed");
		return "from service1 " + proxy.callService2();
	}
}
