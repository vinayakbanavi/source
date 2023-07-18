package pack3;

import java.util.Iterator;

public class M1 
{
	public static void main(String[] args) 
	{
		Integer[] age = {10, 25, 35, 45};
		
		String[] names = {"abc", "xyz", "pqr"};
		
		System.out.println("printing names");
		print(names);
		
		System.out.println("\nprinting age");
		print(age);
		
//		System.out.println("printer - names");
//		printer(names);
//		
//		System.out.println("printer - age");
//		printer(age);
	}
	
	
//	generic method
	public static<E> void print(E[] array)
	{
		for (E e : array) 
		{
			System.out.println(e);
		}
	}
	
//	non generic method
	public static void printer(Object[] array)
	{
		for (Object obj : array)
		{
//			String s1 =(String) obj;          //java.lang.ClassCastException
//			System.out.println(s1);
		}
	}
}
