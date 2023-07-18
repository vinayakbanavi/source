package com.example.practice2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileDownloadController 
{
//	API to send a file so that client can download
//	http://localhost:9090/download
	
	@RequestMapping("download")
	public ResponseEntity<Object> download1() throws Exception
	{
//		first we need to create File Object with URL of the file
		File file = new File("src/main/resources/static/downloads/graph4.png");
		
//		FileInputStream extends InputStream
		FileInputStream fileInput = new FileInputStream(file);
		
//		InputStreamResource is a class
//		Body : 
		InputStreamResource resource = new InputStreamResource(fileInput);
		
//		header : with content-disposition
		HttpHeaders  header = new HttpHeaders();
		header.add("content-disposition", "attachment;filename=" + file.getName());
		
		ResponseEntity<Object> response = new ResponseEntity(resource, header, HttpStatus.OK);
		
		return response;
	}
}
