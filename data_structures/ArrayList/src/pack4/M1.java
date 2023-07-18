package pack4;

import java.util.ArrayList;
import java.util.Collections;

class A
{
	int i;
	
	A(int i)
	{
		this.i = i;
	}
	
	A()
	{
		
	}
	
	public String toString()
	{
		return i + "";
	}
}

public class M1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new A(10));
		list.add(new A());
		list.add(new A(280));
		list.add(new A(48));
		list.add(new A(36));
		list.add(new A(21));
		list.add(new A(19));
		
		System.out.println("list --> " + list);
		
//		even though we are getting elements in the list
//		these elements are in the different objects or object types
//		we can't do sorting directly
		
		Collections.sort(list);
//		Class cast exception
//		In order to sort the custom class must implement COmparable Interface
//		All the Wrapper classes implements Comparable so that we can sort the elements 
//		Comparable interface is available in java.lang package so no need to import we can use directly
//		in order to sort the object based on members we must implement Comparable or Comparator 
		
		
	}
}
