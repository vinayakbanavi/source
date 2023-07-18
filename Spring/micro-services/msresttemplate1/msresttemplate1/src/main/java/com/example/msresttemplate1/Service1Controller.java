package com.example.msresttemplate1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Service1Controller 
{
	@RequestMapping("service1")
	public String service1()
	{
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:9091/service2", String.class);
		String service2 = response.getBody();
		
		return "from msresttemplate1 service1 " + service2;
	}
}
