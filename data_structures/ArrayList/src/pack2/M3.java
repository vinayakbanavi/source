// Adding elements of one list to another list

package pack2;

import java.util.ArrayList;

public class M3 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		System.out.println("List before  : " + list);
		
		ArrayList list1 = new ArrayList();
		list1.add(45);
		list1.add(85);
		list1.add(65);
		list1.add(95);
		System.out.println("List1 before : " + list1);
	
		// inserting elements of one list to another list using addAll(index, value)
		list1.addAll(2, list);
		
		System.out.println("List1 after  : " + list1);
	}
}

/*
 		 Observation :
	---> list.add(list)  ==> (this.collection)
	---> list1.add(list) ==> [elements of list] whole as a one element

*/