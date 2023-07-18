package pack2;

import java.util.HashSet;

public class M3 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(15);
		set.add(2.05);
		set.add('A');
		set.add("hii");
		set.add(false);
		set.add(null);
		
		System.out.println("Searching the set for the specific element");
		System.out.println("set : " + set);
		System.out.println("contains(15)   : " + set.contains(15));
		System.out.println("contains('B')  : " + set.contains('B'));
		System.out.println("contains(null) : " + set.contains(null));
		
		HashSet set1 = new HashSet();
		set1.add('A');
		set1.add("hello");
		set1.add(55);
		
		System.out.println("\nSearching all the elements of one set in other set");
		System.out.println("set                   : " + set);
		System.out.println("set1                  : " + set1);
		System.out.println("set.containsAll(set1) : " + set.containsAll(set1));
		
	}
}
/*
	contains(elements) --> search the set for specific element.
						   returns true if present else false.
						   
	containsAll()	   --> Search all the elements of one set in other set
	                       if all the elements are found returns true.
	                       if any one element is absent returns false
	                       
*/