package pack3;

import java.util.ArrayList;

class D
{
	String name;
	int age;
	
	D(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "(" + name + ", " + age + ")";
	}
	
}

public class M3 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new D("mandela", 32));
		list.add(new D("mandela", 32));
		list.add(new D("mandela", 32));
		list.add(new D("gandhi", 54));
		list.add(new D("bose", 71));
		list.add(new D("bose", 71));
		list.add(new D("bose", 71));
		list.add(new D("bose", 71));
		list.add(new D("rawat", 51));
		list.add(new D("chatarji", 45));
		
		System.out.println(list);
	}
}
