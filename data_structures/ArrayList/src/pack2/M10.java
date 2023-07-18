package pack2;

import java.util.ArrayList;

public class M10 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(15);
		list.add(.025);
		list.add('A');
		list.add(false);
		list.add("hey");
		list.add(null);
		
//		converting the list to Object Array
		Object[] obj = list.toArray();
	
		System.out.println("Reading the elements using for loop and array\n");
		for (int i = 0; i < obj.length; i++) 
		{
			System.out.println(obj[i]);
		}
		
//		we can read the elements of the list one by one through for loop
		System.out.println("\nlength --> size() : " + list.size());
		
		System.out.println("\nReading the elements using for loop\n");
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("\nReading the elements using for each loop\n");
		for (Object object : list) 
		{
			System.out.println(object);
		}
	}
}
