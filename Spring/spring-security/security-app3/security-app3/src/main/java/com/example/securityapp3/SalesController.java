package com.example.securityapp3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sales")
public class SalesController
{
	@GetMapping("service1")
	public String service1()
	{
		return "Sales : service1"; 
	}
	
	@GetMapping("service2")
	public String service2()
	{
		return "Sales : service2";
	}
}
