//removing an element from the list

package pack2;

import java.util.ArrayList;

public class M5 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("akash");
		list.add("lakshmi");
		list.add("indrani");
		list.add("ramesh");
		list.add("akash");
		list.add("suresh");
		
		System.out.println("list : " + list);
		boolean b1 = list.remove("akash");
		
//		by default remove(element) removes only one element which matches the given argument and found first from the list
//		System.out.println("list : " + list);
		Object obj = list.remove(2);
		boolean b2 = list.remove("akshay");
		
		System.out.println("remove(index)  --> " + obj);
		System.out.println("remove(Object) --> " + b1);
		System.out.println("remove(Object) --> " + b2);
		
		System.out.println("\nRemoving different type of elemnts \n");
		
		ArrayList list1 = new ArrayList();
		list1.add(100);
		list1.add(1.5);
		list1.add('A');
		list1.add(false);
		list1.add("hello");
		
		System.out.println("list1                            : " + list1);
		list1.remove(Integer.valueOf(100));
		System.out.println("remove(Integer.valueOf(Object))  : " + list1);
		list1.remove(1.5);
		System.out.println("remove(Double value)             : " + list1);
		list1.remove(Character.valueOf('A'));
		System.out.println("remove(Character.value(char))    : " + list1);
		list1.remove(false);
		System.out.println("remove(Boolean value)            : " + list1);
		list1.remove("hello");
		System.out.println("remove(String value)             : " + list1);
		
		System.out.println(list.remove("empty"));
	}
}

/*

	-->	remove(index)  method returns Object(removed element)
	--> remove(Object) method returns boolean value(status of remove)
		
		Important
	--> remove(index) in index will be of integer by default
	--> so for removing Integer value and the type which can auto up cast to integer(byte,short,char)
	--> Should be removed by using valueOf() method
	--> For other data types we can remove directly
	
	--> remove(index)  returns Removed object
	--> remove(Object) returns boolean value
	
*/