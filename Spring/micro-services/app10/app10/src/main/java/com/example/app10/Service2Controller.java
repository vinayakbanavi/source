package com.example.app10;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller 
{
	@RequestMapping("service2")
	public String service2()
	{
		System.out.println("service2 accessed");
		return "from service2 " + this;
	}
}

/*
 	multiple instances available in app10
 	these instances available to load balancer
 	load balancer will take careof using app10 instances in app9
 	
 	we will always balance the load on client side only.
 	server side is also possible.
*/