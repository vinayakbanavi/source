package listIterator;

import java.util.ArrayList;
import java.util.ListIterator;

// ListIterator - cursor 3.0
// Succeeds iterator
// Read, Remove, Set functions
// interface in Collection API extends Iterator interface
// CRUD --> Create, Read, Update Delete

public class M1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList();
		list.add("Ashoka");
		list.add("Bindusara");
		list.add("Chandragupta");
		list.add("Samudragupta");
		list.add("karikala");
		list.add("Adityan");
		
		System.out.println("list : " + list);
		
//		Fail Fast Iterator
		{
			ListIterator<String> it = list.listIterator();   // Fail Fast Iterator
//			list.add("Nripatunga");                          //  ConcurrentModificationException
			while (it.hasNext()) 
			{
				System.out.println(it.next());
			}
		}
		
//		CREATE
		{
			System.out.println("\nit.add() adds the element to the list as first element");
			ListIterator<String> it = list.listIterator();
			it.add("Nripatunga");  //adds to the list as a first element after it operation.
			while (it.hasNext()) 
			{
				System.out.println(it.next());
			}
			
			System.out.println("list : " + list);
		}
		
//		READ --> possible in forward and backward
//		backward read is possible only if forward read is happened
		{
			System.out.println("\nReading in Forward Direction");
			
			ListIterator<String> it = list.listIterator();
			while (it.hasNext())
			{
				System.out.print(it.next() + " ");
			}
			
			System.out.println("\nReading in Backward Direction");
			while (it.hasPrevious())
			{
				System.out.print(it.previous() + " ");
			}
			
		 }
		
//		UPDATE
		{
			System.out.println("\n\nUpdating the specific element from the list");
			System.out.println("list before  : " + list);
			
			ListIterator it = list.listIterator();
			while (it.hasNext())
			{
				if (it.next() == "Ashoka")
				{
					it.set("Ashoka Chakravartin");
				}
			}
			System.out.println("Updated list : " + list);
		}
		
//		DELETE
		{
			System.out.println("\nDeleting the specific element from the list");
			
			System.out.println("list before   : " + list);
			ListIterator it = list.listIterator();
			while (it.hasNext())
			{
				if (it.next() == "Samudragupta") 
				{
					it.remove();
				}
			}
			
			System.out.println("Modified list : " + list);
		}
	}
}
