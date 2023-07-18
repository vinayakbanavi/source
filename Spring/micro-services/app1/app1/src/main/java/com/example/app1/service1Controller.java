package com.example.app1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class service1Controller 
{
	
	@RequestMapping("service1")
	public String service1()
	{
		System.out.println("service1 accessed");
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> responseEntity = rt.getForEntity("http://localhost:9091/service2", String.class);
		String results = responseEntity.getBody();
		return "from service1" + results;
	}
}
