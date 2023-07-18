package com.example.practice2;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class returnController
{
//	returns int
	@RequestMapping("returnsInt")
	public int return1()
	{
		System.out.println("return1 accessed");
		return 100;
	}
	
//	returns Double
	@RequestMapping("returnsDouble")
	public double return2()
	{
		System.out.println("return2 accessed");
		return 100.0;
	}
	
//	returns char
	@RequestMapping("returnsChar")
	public char return3()
	{
		System.out.println("return3 accessed");
		return 'A';
	}
	
//	returns boolean
	@RequestMapping("returnsBoolean")
	public boolean return4()
	{
		System.out.println("return4 accessed");
		return false;
	}
	
	
//	returns object
	@RequestMapping("returnsObject")
	public Person return5()
	{
		System.out.println("return5 accessed");
		Person p1 = new Person();
		p1.setFirstName("Shreeman");
		p1.setLastName("Shreshta");
		return p1;
	}
	
//	returns array : any type of array can be returned
	@RequestMapping("returnsIntArray")
	public int[] return6()
	{
		System.out.println("return6 accessed");
		int[] a1 = {1,2,3,4};
		
		return a1;
	}
	
	
//	returns ArrayList : any type of collection can be returned
	@RequestMapping("returnsArrayList")
	public ArrayList<String> return7()
	{
		System.out.println("return7 accessed");
		ArrayList<String> list = new ArrayList();
		list.add("abc");
		list.add("def");
		return list;
	}
	
//	returns Hashmap
	@GetMapping("returnsHashMap")
	public HashMap<Student, Academics> return8()
	{
		System.out.println("return8 accessed");
		HashMap<Student, Academics> map = new HashMap();
		
		Student s1 = new Student();
		s1.setId("L001");
		s1.setFirstName("Vinayak");
		s1.setLastName("Banavi");
		
		Academics a1 = new Academics();
		a1.setEducation("BE");
		a1.setSkills("Art");
		a1.setSkills("Coding");
		a1.setSkills("Communication");
		
		a1.setAggregate(72.8);
		
		map.put(s1, a1);
		return map;
	}
	
//	returns String
	@GetMapping("returnsString")
	public String return9()
	{
		System.out.println("return9 accessed");
		return "String";
	}
	
//	returns void
	@RequestMapping("returnsVoid")
	public void return10()
	{
		System.out.println("return10 accessed");
	}
}


