package com.example.app12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller 
{
	@Autowired
	private ProxyForApp13 proxy;
	
	@RequestMapping("service1")
	public String service1()
	{
		return "from service1 " + proxy.callService2();
	}
}
