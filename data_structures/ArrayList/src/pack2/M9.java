package pack2;

import java.util.ArrayList;

public class M9 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("akash");
		list.add(578);
		list.add(false);
		list.add('a');
		list.add(100.5);
		list.add(null);
		
//		in order to read the element at specific Index we can use get method
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		
		System.out.println("\ninitializing elements to local variable\n");
//		System.out.println(list.get(-1));  //index out of bounds Exception
//		System.out.println(list.get(6));
		
//		in add method all the elements are stored in the Object array 
		
		Object obj1 = list.get(0);
		Object obj2 = list.get(4);
		
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		
		System.out.println("\ndowncasting elements from Object class type to specific type\n");
		
		String s1  = (String)  list.get(0);
		int i1     = (Integer) list.get(1);
		boolean b1 = (boolean) list.get(2);
		char c1    = (Character) list.get(3);
		
		System.out.println("string  : " + s1);
		System.out.println("int     : " + i1);
		System.out.println("boolean : " + b1);
		System.out.println("char    : " + c1);
		
	}
}
/* 
	ArrayList --> preserves Order of Addition
			  --> uses Array internally
			  --> series of memory is allocated for each index
			  --> every element will be stored at the specific index
			  
*/
