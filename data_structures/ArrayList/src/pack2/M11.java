package pack2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class M11 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(15);
		list.add(.025);
		list.add('A');
		list.add(false);
		list.add("hey");
		list.add(null);

//		using Iterator interface to iterate elements		
		Iterator it = list.iterator();
		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		System.out.println();
//		using ListIterator interface to iterate elements
		ListIterator it1 = list.listIterator();
		while (it1.hasNext()) 
		{
			System.out.println(it1.next());			
		}
	}
}
/*
 
 --> Iterator(java.util) is a interface used to iterate the ArrayList
 --> ArrayList iterator method returns the implementation of Iterator interface
*/