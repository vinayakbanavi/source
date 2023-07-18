package com.example.manytomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

}

/*
		@SpringBootApplication is a combination of 
			1. @Configuration 
			2. @EnableAutoConfiguration 
			3. @ComponentScan
*/