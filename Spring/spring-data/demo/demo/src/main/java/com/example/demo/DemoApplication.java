package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("restful webservices started");
	}
	
}

// http://localhost:9090 /hello
// in the same port number multiple application can't run
// so run the application as configuration and in argument change the server by VM arguments -Dserver.port = 9092
