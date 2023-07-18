package com.example.demo.controllers;

import java.io.FileOutputStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController
{
	@RequestMapping("upload")
	public String upload(@RequestParam MultipartFile file) throws Exception
	{
		FileOutputStream fout = new FileOutputStream(file.getOriginalFilename());
		fout.write(file.getBytes());
		fout.flush();
		fout.close();
		return "file uploaded successfully";
	}
}
