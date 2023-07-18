//inserting elements to the list

package pack2;

import java.util.ArrayList;

public class M2 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		System.out.println("List before : " + list);
		
//		inserting an element at specific index
//		add(index, value)
		list.add(2, "inserted");
//		list.add(list); no error in place of list --> (this Collection)
		System.out.println("List after  : " + list);
	}
}

/*
 		return type of --> add(index, element) is void
 		System.out.println(list.add(2, "inserted")); --> Error
 		System.out.println(list1.addAll(2, list)); --> returns boolean value
 */
