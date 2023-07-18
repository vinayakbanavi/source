package pack2;

import java.util.HashSet;
import java.util.Iterator;

public class M5 
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
		
		
		System.out.println("Iterating set by various ways");
		
		System.out.println("\n1. for each loop");
		for (Object object : set) 
		{
			System.out.println(object);
		}
		
//		we can convert set to array using toArray();
		
		System.out.println("\n2. by converting set toArray");
		Object[] obj = set.toArray();
		
		for (int i = 0; i < obj.length; i++) 
		{
			System.out.println(obj[i]);
		}
		
		System.out.println("\n3. by Iterator interface");
		Iterator it = set.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		System.out.println("\n4. size() method");
		System.out.println(set.size());
	}
}
/*
 	Reading elements of set
 	for loop is not possible for set since Order of addition is not preserved
 	there is no get() implemented in set even though we have size();
 	
 	advanced for loop is possible
 	
 	iterator,
 	list iterator is not implemented.
*/