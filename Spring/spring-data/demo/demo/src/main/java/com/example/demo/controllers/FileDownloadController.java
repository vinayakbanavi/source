package com.example.demo.controllers;

import java.io.File;
import java.io.FileInputStream;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileDownloadController 
{
	@RequestMapping("download")
	public ResponseEntity<Object> download() throws Exception
	{
		File file = new File("src/main/resources/static/images/gettyimages-1459229416-170667a.jpg");
		
		FileInputStream fileInput = new FileInputStream(file);
		
//		ResponseEntity Body
		InputStreamResource resource = new InputStreamResource(fileInput);
		
//		Header
		HttpHeaders header = new HttpHeaders();
		header.add("content-disposition", "attachment;filename=" + file.getName());
		
		return new ResponseEntity<Object>(resource,header, HttpStatus.OK);
		
	}
}
