package com.example.securityapp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SecurityApp2Application implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public static void main(String[] args) {
		SpringApplication.run(SecurityApp2Application.class, args);
	}
	
@Override
public void run(String... args) throws Exception {
	Person p1 = new Person();
	p1.setUsername("vijay@gmail.com");
	p1.setPassword(encoder.encode("123"));
	p1.setRole("ROLE_SOFTWARE");
	personRepository.save(p1);
	
	Person p2 = new Person();
	p1.setUsername("sweta@gmail.com");
	p1.setPassword(encoder.encode("abc"));
	p1.setRole("ROLE_HR");
	personRepository.save(p2);
	
	
}
}
