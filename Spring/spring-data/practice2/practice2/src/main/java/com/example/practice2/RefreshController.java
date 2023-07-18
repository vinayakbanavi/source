package com.example.practice2;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefreshController 
{
//	API to refresh the HTML page at specified interval
	int count;
	
	@RequestMapping("refresh1")
	public ResponseEntity<String> refresh1()
	{
		return ResponseEntity.ok()
//				             .header("content-type", "text/plain") also possible
				             .header("content-type", "text/html")
				             .header("refresh", "1")
				             .body("<h1 style=\"color:orange\">" + "StopWatch : "+ count++ + "</h1>");
	}
	
	
//	We can also develop the same api as above using COnstructor()
//	http://localhost:9090/refresh2
	
	@RequestMapping("refresh2")
	public ResponseEntity<String> refresh2()
	{
//		HttpHeaders from springframework
		HttpHeaders header = new HttpHeaders();
		header.add("content-type", "text/html");
		header.add("refresh", "1");    // unit of 1 is milliseconds
		String body = "<h1> counter : " + count++ + "<h1>";
		ResponseEntity<String> response = new ResponseEntity<String>(body, header, HttpStatus.OK);
		
		return response;
	}
}
