 package com.example.securityapp3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SecurityApp3Application implements CommandLineRunner 
{
	@Autowired
	private AppUserRepository appUserRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public static void main(String[] args)
	{
		SpringApplication.run(SecurityApp3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{	
		AppUser user1 = new AppUser();
		user1.setUsername("ramu@gmail.com");
		user1.setPassword(bCryptPasswordEncoder.encode("123"));
		user1.setRole("SALES");
		appUserRepository.save(user1);
		
		AppUser user2 = new AppUser();
		user2.setUsername("rupa@gmail.com");
		user2.setPassword(bCryptPasswordEncoder.encode("xyz"));
		user2.setRole("MARKETING");
		appUserRepository.save(user2);
		
		AppUser user3 = new AppUser();
		user3.setUsername("vinayak@gmail.com");
		user3.setPassword(bCryptPasswordEncoder.encode("13579"));
		user3.setRole("ADMIN");
		appUserRepository.save(user3);
	}	
}
