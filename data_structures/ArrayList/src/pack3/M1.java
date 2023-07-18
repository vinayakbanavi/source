package pack3;

import java.util.ArrayList;

// Custom entity
class A
{
	int i;
	
	A(int i)
	{
		this.i = i;
	}
}

public class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A(10);
		A a2 = new A(10);
		A a3 = new A(10);
		A a4 = new A(10);
		
//		whenever we print or read reference variable of an Object or new Object();
//		internally toString() of Object class get executed 
//		converts the memory address into hexaDecimal output
		  
		System.out.println("Memory addres of a1      : " + a1);
		System.out.println("memory address of object : " + new A(25));
		
		String s1 = "" + a1;
		System.out.println("String s1 = a1.toString(): " + s1);
		
//		Adding the objects into the ArrayList
		System.out.println("\nadding objects into the list\n");
		ArrayList list = new ArrayList();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		
		System.out.println(list);
		
//		regardless of the elements or members in the object, 
//		memory address will be stored or added into the list.
		
	}
}
