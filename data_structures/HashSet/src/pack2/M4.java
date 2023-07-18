package pack2;

import java.util.HashSet;

public class M4 
{
	public static void main(String[] args) 
	{
//		remove();
		{
			HashSet set = new HashSet();
			set.add(15);
			set.add(2.05);
			set.add('A');
			set.add("hii");
			set.add("element");
			set.add(false);
			set.add(null);
			
			System.out.println("Removing elements from the set");
			System.out.println("set : " + set);
			System.out.println("set.remove(element) : "  + set.remove("element"));
			System.out.println("set.remove(15)       : " + set.remove(15));
			System.out.println("updated set : " + set);
		}
		
//		removeAll();
		{
		
			HashSet set = new HashSet();
			set.add(15);
			set.add(2.05);
			set.add('A');
			set.add("hii");
			set.add("element");
			set.add(false);
			set.add(null);
				
			HashSet set1 = new HashSet();
			set1.add('A');
			set1.add("hello");
			set1.add(55);
			
			System.out.println("\nRemoving elements of one set in other set");
			System.out.println("set  : " + set);
			System.out.println("set1 : " + set1);
			System.out.println("set.removeAll(set1) : " + set.removeAll(set1));
			System.out.println("updated set : " + set);
		}
		
//		retainAll();
		{
			HashSet set2 = new HashSet();
			set2.add('A');
			set2.add("hello");
			set2.add(55);
			set2.add(false);
			set2.add(null);
			
			HashSet set3 = new HashSet();
			set3.add('A');
			set3.add("hii");
			set3.add(11);
			set3.add(false);
			set3.add(null);
			
			System.out.println("\nRetaining elements of one set in other set");
			System.out.println("set  : " + set2);
			System.out.println("set1 : " + set3);
			System.out.println("set2.retainAll(set3) : " + set2.retainAll(set3));
			System.out.println("updated set : " + set2);
		}
	}
}
/*
	set.remove(element) --> removes the specific element from the set.
	set.remove(index)   --> there is no remove method with int index,
							so the argument is considered as element only.
						--> returns boolean value
							
	set.removeAll(set1) --> searches for each element of the set1 in set and if found removes that element.
			
	set.retainAll(set1) --> retains the common elements 
	                        Searches for each element of set in set1 if found retains else remove;
*/