package com.example.securityapp3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("marketing")
public class MarketingController 
{
	@GetMapping("service1")
	public String service1()
	{
		return "Marketing : service1"; 
	}
	
	@GetMapping("service2")
	public String service2()
	{
		return "Marketing : service2";
	}
}
