package com.example.manytomany;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//class level mapping
@RequestMapping("t1")
public class Test1Controller 
{
//	@RequestMapping("t1")
//	@GetMapping("t1")
	
//	Both RequestMapping and GetMapping works the same
//	Generally GetMapping is used to read (Only through Browser Address Bar)
//	We can't post while using GetMapping (posting Json Object)
	
//	Where as RequestMapping is used for both read/write
	
//	http://localhost:9090/t1
	@GetMapping
	public String test1()
	{
		System.out.println("from test1");
		return "from test1";
	}
	
//	http://localhost:9090/t1/t2
	@GetMapping("t2")
	public String test2()
	{
		System.out.println("from test2");
		return "from test2";
	}

//	http://localhost:9090/t1
//	PostMapping is used whenever posting Json Object
	@PostMapping
	public String test3()
	{
		System.out.println("from test3");
		return "from test3";
	}

//	http://localhost:9090/t1/t4
	@PostMapping("t4")
	public String test4()
	{
		System.out.println("from test4");
		return "from test4";
	}
	
}

// HTTP methods
//	1. PUT is used for updating entire row
//  2. PATCH is used for updating specific column in a selected row. 