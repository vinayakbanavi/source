package pack3;

import pack1_implementation.ArrayList;

class B
{
	String name;
		
	
	B(String name)
	{
		this.name = name;
	}
	
//	overriding toString() to return whatever we required;
	public String toString()
	{
		return name;
	}
}

public class M2 
{
	public static void main(String[] args) 
	{
		B b1 = new B("alok");
		B b2 = new B("rizwan");
		B b3 = new B("sunaina");
		B b4 = new B("zarrin");

//		overriding toString() in the class where we are creating object
//		after overriding reference variable will print the content overridden and also acts as a reference
		
		System.out.println("b1 --> " + b1);
		System.out.println("b2 --> " + b2);
		System.out.println("b3 --> " + b3);
		System.out.println("b4 --> " + b4);
		
		ArrayList list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		System.out.println("ArrayList --> " + list);
	}
}
