package enumeration;

import java.util.Enumeration;
import java.util.Vector;

// Enumeration is cursor 1.0
// predefined interface - retrieving data From collection framework
// Only legacy classes implement these interface
// Available in only Legacy Classes (Dictionary, Stack, Properties, Vector, HashTable) 
// with enumeration we can only read the data in a forward direction, not in backward direction.

public class M1 
{
	public static void main(String[] args) 
	{
//		without generic's
		{
			Vector list = new Vector();
			list.add(100);
			list.add(10.5);
			list.add('A');
			list.add(false);
			list.add("Hello");
			list.add(null);
			
			System.out.println("vector list: " + list );
			
//			elements() will return Enumeration implemented object
			
			Enumeration en = list.elements();
			System.out.println("Reading Vector list elements with Enumeration interface");
			while(en.hasMoreElements())
			{
				System.out.println(en.nextElement());
			}
		}
		
//		with generics
		{
			Vector<Integer> list = new Vector();
			list.add(100);
			list.add(150);
			list.add(100);
			list.add(150);
			
			System.out.println("\nVector list with generics : " + list);
			
			System.out.println("Reading elements with Enumertaion");
			
			Enumeration<Integer> en = list.elements();
			list.add(25); // --> ConcurrentModification is possible
			while (en.hasMoreElements())
			{
				System.out.println(en.nextElement());
			}
		}	
	}
}

/*
   Enumeration - enum in short special DataType Which contains a set of predefined constants
               - values that aren't required to change like Days of the week, months, colors etc
*/