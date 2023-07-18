package com.example.jpadev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDev6Application {

	public static void main(String[] args) {
		SpringApplication.run(JpaDev6Application.class, args);
		System.out.println("Person jdbc established");
	}

}
