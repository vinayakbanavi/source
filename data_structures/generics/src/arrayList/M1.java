package arrayList;

import java.util.ArrayList;

public class M1 
{
	public static void main(String[] args) 
	{
		{
			ArrayList<Integer> list = new ArrayList<>();
			list.add(100);
			list.add(200);
			list.add(300);
			list.add(400);
			
			System.out.println("list : " + list);
			
			list.add(null);      // we can add null(default value for wrapper class)
			
			System.out.println("list : " + list);
			
//			list.add(100.5);
//			list.add("String");     Since we supplied Integer through generics we must use Integer only
//			list.add(false);        we can't add any other DataType.
//			list.add('A');
			
//			since list contains elements of Only one datatype no need to down cast
			int i1 = list.get(0);
			int i2 = list.get(1);
			int i3 = list.get(2);
			int i4 = list.get(3);
			
		}
		
//		on the other hand if we don't Supply data type through generics
		{
			ArrayList list = new ArrayList();
			list.add(100);
			list.add(100.5);
			list.add("String");   //  Since we didn't supplied DataType by default <Object> will be supplied
			list.add(false);      //  we can add any DataType elements.
			list.add('A');
			list.add(null);      // we can add null
			
			System.out.println("\nlist : " + list);
			
//			since list contains Object type elements we must downcast
//			int i1     = list.get(0);
//			double d1  = list.get(1);
//			String s1  = list.get(2);
//			boolean b1 = list.get(3);
//			char c1    = list.get(4);
			
			int i1     = (int)     list.get(0);
			double d1  = (double)  list.get(1);
			String s1  = (String)  list.get(2);
			boolean b1 = (boolean) list.get(3);
			char c1    = (char)    list.get(4);
		}
	}
}
