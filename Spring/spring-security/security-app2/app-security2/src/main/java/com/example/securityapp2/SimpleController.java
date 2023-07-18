package com.example.securityapp2;

import org.springframework.web.bind.annotation.GetMapping;

public class SimpleController {

	@GetMapping("hello")
	public String getHello()
	{
		System.out.println("from hello");
		return "from hello";
	}
	@GetMapping("test")
	public String getTest()
	{
		System.out.println("from test");
		return "from test";
	}
}
