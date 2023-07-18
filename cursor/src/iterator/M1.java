package iterator;

import java.util.ArrayList;
import java.util.Iterator;

// Iterator cursor 2.0
// Iterator succeeds Enumeration
// Read - only in one direction and remove function.
// Works as a pointer only does not store elements.
// iterator() from Iterable interface overridden in Collection classes(List, Set & Map) calls Iterator interface

public class M1 
{
	public static void main(String[] args) 
	{
//	List
		{
			ArrayList<String> list = new ArrayList();
			list.add("Rakshas");
			list.add("Pravah");
			list.add("Minnal");
			list.add("Baansi");
			list.add("Sosaan");
			list.add("Warna");
			System.out.println("List : " + list);
			
			System.out.println("\nReading elements Of List with iterator");
			{
				Iterator<String> it = list.iterator();   // FailFastIterator -- does not allow simultaneous Modification
//			    list.add("fail fast iterator");  // ConCurrentModificationException
				while (it.hasNext())
				{
					System.out.println(it.next());
				}
			}
			
			System.out.println("\nRemoving element From List with iterator");
			{
				
				System.out.println("list before : " + list);
				Iterator it = list.iterator();
				while (it.hasNext())
				{
					if(it.next() == "Baansi")
						it.remove();
				}
				System.out.println("list after : " + list);
			}

//			Reading is possible only once and in one direction
			System.out.println("\nReading through iterator multiple times");
			{
				Iterator it = list.iterator();
				
//				1st Read successful				
				while (it.hasNext()) 
				{
					System.out.println(it.next());
				}

//				2nd Read unSuccessful
				while (it.hasNext()) 
				{
					System.out.println(it.next());
				}
				
//				3rd Read unSuccessful
				while (it.hasNext()) 
				{
					System.out.println(it.next());
				}
				
			}
		}
		
	}
}
