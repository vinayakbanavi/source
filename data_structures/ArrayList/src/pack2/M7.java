package pack2;

import java.util.ArrayList;

public class M7 
{

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("akash");
		list.add("lakshmi");
		list.add("indrani");
		list.add("ramesh");
		list.add("suresh");
		
		ArrayList list1 = new ArrayList();
		list1.add("people");
		list1.add("indrani");
		list1.add("hurts");
		
		System.out.println("list  : " + list);
		System.out.println("list1 : " + list1);
//		to remove all the available elements of one list in another list
//		removeAll(list) is used
		System.out.println(list.removeAll(list1)); // --> removeAll method returns boolean
		
//		list.removeAll(list);
		System.out.println("list  : " + list);
	}

}
