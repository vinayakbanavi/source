package pack2;

import java.util.HashSet;

public class M2 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(15);
		set.add(20);
		set.add(05);
		set.add(10);
		set.add(25);
		
//		System.out.println("Attempting to set.get()     : " + set.get(5));
//		System.out.println("Attempting to set.indexOf() : " + set.indexOf(20));
//		System.out.println("Attempting to set.set()     : " + set.set(0, "update"));
	}
}

/*
	get()               is not possible
	indexOf(element)    is not possible
	set(index, element)	is not possible			
*/