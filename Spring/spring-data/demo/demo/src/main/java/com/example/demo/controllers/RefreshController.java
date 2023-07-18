package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefreshController 
{
	private int counter;
	
	@RequestMapping("refresh")
	public ResponseEntity<String> refresh()
	{
		return ResponseEntity.ok().header("content-type", "text/html").header("refresh", "1").body("<h1> counter : " + counter++ + "</h1>");
	}
}
