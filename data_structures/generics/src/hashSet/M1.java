package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class M1
{
	public static void main(String[] args) 
	{
//		with Generic's
		{
			HashSet<Integer> set = new HashSet();
			set.add(100);
			set.add(200);
			set.add(300);
			set.add(400);
			
			System.out.println("Generic set : " + set);
			
//			Set<Integer> only allows Integer type elements 
			
//			set.add(100.5);
//			set.add('A');
//			set.add(false);
//			set.add("String");
			
//			TypeCasting not required
			
			System.out.println("Reading the elements without Type casting : ");
			for (int i : set) 
			{
				System.out.println(i);
			}
		}
		
//		without Generic's
		{
			HashSet set = new HashSet();
			set.add(100);
			set.add(.10);
			set.add('A');
			set.add(true);
			set.add("Hello");
			set.add(null);
			
			System.out.println("\nNon Gen set : " + set);
			
//			Non Generic Set <Object> allows any Type of elements
			
//			TypeCasting required But in set Order of addition is not preserved so get() is not there
			
			System.out.println("Reading the elements by upcasting : ");
			for (Object obj : set) 
			{
				System.out.println(obj);
			}
			
		}
		
	}
}
