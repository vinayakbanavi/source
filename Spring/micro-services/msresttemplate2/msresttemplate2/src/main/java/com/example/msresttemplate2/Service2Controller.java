package com.example.msresttemplate2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller 
{
//	http:\localhost:9091\service2
	@RequestMapping("service2")
	public String service1()
	{
		return "from msresttemplate2 service2";
	}
}
