// updating (replacing specific element) from the list

package pack2;

import java.util.ArrayList;

public class M4 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		System.out.println("before : " +list);
		
		// if we want to replace 25, first we need to know index of 25 in the list
		int i = list.indexOf(25);
		// replace 25 with 100 by using set(index, value) method.
		System.out.println("updated : " + list.set(i, 100));
		
		System.out.println("after  : " + list);
	}
}

/*
  --> List maintains order of addition
   	- hence, elements have specific index.
  --> indexOf() is available to check specific String or character
  --> in order to set we must specify the index number and than value
  --> since index is involved OutOfBoundException must be considered
  
  --> set(index, value) method returns previous object(replaced element). 
 */

