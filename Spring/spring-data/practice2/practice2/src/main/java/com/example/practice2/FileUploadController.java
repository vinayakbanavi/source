package com.example.practice2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController 
{
//	client upload
//	uploads must be done from ARC by choosing body content type as multipart/form-data
	
	@RequestMapping("uploadFile")
	public String upload1(@RequestParam MultipartFile file) throws Exception
	{
		FileOutputStream fout = new FileOutputStream(file.getOriginalFilename());
		fout.write(file.getBytes());
		fout.flush();
		fout.close();
		return "file upload successfull"; 
	}
	
//	multiple uploads
	
	@RequestMapping("upload/profilePic/resume")
	public String upload2(@RequestParam MultipartFile profilePic,
			              @RequestParam MultipartFile resume) throws Exception
	{
		FileOutputStream fout1 = new FileOutputStream(profilePic.getOriginalFilename());
		fout1.write(profilePic.getBytes());
		fout1.flush();
		fout1.close();
		
		FileOutputStream fout2 = new FileOutputStream(resume.getOriginalFilename());
		fout2.write(resume.getBytes());
		fout2.flush();
		fout2.close();
		
		return "profile pic and resume uploaded Successfully";
	}
	
//	we can also receive other format parameters along with file
	
	@RequestMapping("upload/file/firstName")
	public String upload3(@RequestParam MultipartFile file,@RequestParam String firstName) throws Exception
	{
		FileOutputStream fout = new FileOutputStream(file.getOriginalFilename());
		fout.write(file.getBytes());
		fout.flush();
		fout.close();
		
		return "file upload success " + firstName;
	}
}
