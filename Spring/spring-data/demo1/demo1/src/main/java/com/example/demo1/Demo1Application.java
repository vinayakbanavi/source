package com.example.demo1;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {

	public static void main(String[] args) 
	{
		SpringApplication.run(Demo1Application.class, args);
		System.out.println("app started ...");
	}
	
	@GetMapping("name") // http://localhost:9092/name
	public String name()
	{
		System.out.println("name acessed");
		return "Vinayak";
	}
	
	@GetMapping("age")  // http://localhost:9092/age
	public int age()
	{
		System.out.println("age acessed");
		return 25;
	}
	
	@GetMapping("isMarried")	 // http://localhost:9092/isMarried
	public boolean isMarried()
	{
		System.out.println("isMArried acessed");
		return false;
	}
	
	@GetMapping("test")  // http://localhost:9092/test
	public int[] test()
	{
		System.out.println("test acessed");
		int elements[] = {10, 20, 30};
		return elements;
	}
	
	@GetMapping("test1")	// http://localhost:9092/test1
	public HashMap<String, Integer> test1()
	{
		System.out.println("test1 acessed");
		HashMap<String, Integer> map = new HashMap();
		map.put("Vinayak", 27);
		map.put("Anand", 25);
		map.put("Pratham", 24);
		
		return map;
	}
	
	@GetMapping("test2")	// http://localhost:9092/test2
	public ArrayList<HashMap<String, Integer>> test2()
	{
		System.out.println("test2 acessed");
		HashMap<String, Integer> map1 = new HashMap();
		map1.put("Vinayak", 27);
		map1.put("Anand", 25);
		map1.put("Pratham", 24);
		
		HashMap<String, Integer> map2 = new HashMap();
		map2.put("Ram", 35);
		map2.put("lakshman", 37);
		map2.put("Bharat", 39);
		
		ArrayList<HashMap<String, Integer>> list = new ArrayList();
		list.add(map1);
		list.add(map2);
		
		return list;
	}
	
	@GetMapping("test3")   // http://localhost:9092/test3
	public Person test3()
	{
		System.out.println("test3 is acessed");
		Person p1 = new Person();
		p1.setFirstName("Vinayak");
		p1.setLastName("Banavi");
		p1.setAge(26);
		
		return p1;
	}
	
	@GetMapping("test4")  // http://localhost:9092/test4
	public Student test4()
	{
		System.out.println("test4 acessed");
		Student s1 = new Student();
		s1.setFirstName("Akshay");
		s1.setLastName("javed");
		String[] emailIds = {"abc@gmail.com", "xyz@gmail.com"};
		s1.setEmailIds(emailIds);
		long[] mobileNumbers = {9988776655L, 9876543210L};
		s1.setMobileNumbers(mobileNumbers);
		
		ArrayList<String> projectNames = new ArrayList<>();
		projectNames.add("QuantumComputing");
		projectNames.add("AI");
		projectNames.add("MarsMission");
		
		s1.setProjectNames(projectNames);
		
		Address s1address = new Address();
		s1address.setHouseNo("123/B");
		s1address.setCity("Bangalore");
		s1address.setStreetName("BTM");
		s1address.setState("Karnataka");
		
		s1.setAddress(s1address);
		
		return s1;
	}
	
	@GetMapping("test5")    // 
	public void test5()
	{
		System.out.println("test5 acessed");
	}
}

