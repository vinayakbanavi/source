package pack2;

import java.util.ArrayList;

public class M8
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("akash");
		list.add("lakshmi");
		list.add("ramesh");
		list.add("indrani");
		list.add("suresh");
		
		ArrayList list1 = new ArrayList();
		list1.add("people");
		list1.add("indrani");
		list1.add("hurts");
		
		System.out.println("list  : " + list);
		System.out.println("list1 : " + list1);

//		retainAll(list) retains only common elements available in the list supplied and remove remaining elements
		System.out.println(list.retainAll(list1)); //--> retainAll() method returns boolean
		
//		list.retainAll(list1);
		System.out.println("list  : " + list);
	}
}
