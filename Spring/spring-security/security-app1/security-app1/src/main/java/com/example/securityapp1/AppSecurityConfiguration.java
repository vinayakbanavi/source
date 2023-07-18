package com.example.securityapp1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppSecurityConfiguration 
{
//	while starting an application the methods with @Bean will execute
	@Bean
	public BCryptPasswordEncoder getEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService getUser(BCryptPasswordEncoder encoder)
	{
		InMemoryUserDetailsManager userManager = new InMemoryUserDetailsManager();
//		User : from security.core
		userManager.createUser(User.withUsername("pacifist").
									password(encoder.encode("12345")).
									roles("Employee").
									build());
		
		userManager.createUser(User.withUsername("vinayak").
									password(encoder.encode("1234")).
									roles("Admin").
									build());
		
		userManager.createUser(User.withUsername("boss").
									password(encoder.encode("1234")).
									roles("Admin", "Employee").
									build());
		
		
		return userManager;
	}
	
//	for Authorization  
	
	@Bean
	public SecurityFilterChain authorization(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests().
//		everybody must allow server "/" than only services inside can be accessed.
		requestMatchers("/").permitAll().
		requestMatchers("/hello").hasRole("Employee").
		requestMatchers("/test").hasAnyRole("Employee", "Admin").
		and().
		httpBasic();
		return http.build();
	}
}
