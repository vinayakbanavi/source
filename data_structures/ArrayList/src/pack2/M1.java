// Adding elements to the list 

package pack2;

import java.util.ArrayList;

public class M1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(25.5);
		list.add('F');
		list.add(false);
		list.add("abc");
		list.add(null);
		System.out.println(list);
		
		ArrayList list1 = new ArrayList();
		list1.add(15);
		list1.add(15);
		list1.add(null);
		list1.add(null);
		list1.add("abc");
		list1.add("abc");
		list1.add(false);
		list1.add(false);
		System.out.println(list1);
		
		System.out.println("After list1.addAll(list) : " + list1.addAll(list));
		System.out.println(list1);
	}
}

/*
   --> ArrayList<Object> list = new ArrayList<Object>();
    
   --> We are not supplying any data type through generic
   --> Default type will be Object class type
   
   --> if it is Object type.
   	   Object is super most class to all the classes including wrapper classes.
   	   Byte, Short, Integer, Long, Float, Double, Character, Boolean, String etc.
   	   So we can add all these type.
   	   
   --> List - Order of addition is preserved
   			- Default value for any class and interface is null.
   			- we can add null also
   			- List allows duplicates
   
   --> add() method returns boolean value
   --> addAll() method returns boolean value
   	   
   

*/