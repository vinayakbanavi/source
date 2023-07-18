package pack2;

import java.util.ArrayList;
import java.util.Collections;

public class M12
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(15);
		list.add(58);
		list.add(3);
		list.add(35);
		list.add(105);
		list.add(78);
//		list.add("String");  --> ClassCastException
//		list.add(null);      --> NullPointerException
		
//		Sorting the elements in the ArrayList using Collections class
//		sort(list) is used to sort the elements
//		Collections(class) is available in only list stream
		
		System.out.println("list before sort : " + list);
		Collections.sort(list);
		System.out.println("list after sort  : "+list);
		
//      sorting the elements in the descending order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("list after reverse sort : "+list);
		
		
//		Finding the minimum element in the list
		System.out.println("minimum element : " + Collections.min(list));
//		Finding the maximum element in the list
		System.out.println("minimum element : " + Collections.max(list));
		
		list.clear();
		System.out.println(list);
	}
}
/*
 	For sorting all the members must be of same type
 	if different type of elements we will get : ClassCastException
 	if null is there we will get NullPointerException
	
*/