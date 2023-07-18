package pack2;

import java.util.HashSet;

public class M6 
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		set.add(15);
		set.add(2.05);
		set.add('A');
		set.add("hii");
		set.add(false);
		set.add(null);
		
		System.out.println("set           : " + set);
		set.clear();
		System.out.println("set.isEmpty() : " + set.isEmpty());
		System.out.println("set           : " + set);
	}
}
