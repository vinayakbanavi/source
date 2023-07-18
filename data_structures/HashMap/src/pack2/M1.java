package pack2;

import java.util.HashMap;

class A
{
	int i;
	
	A(int i)
	{
		this.i = i;
	}
}

public class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A(25);
		A a2 = new A(15);
		A a3 = new A(18);
		A a4 = new A(17);
		
//		printing reference or new object gives memory address
		{
			System.out.println("printing a1 : " + a1);
			String s1 = a1.toString();
			
			System.out.println("printing s1 : " + s1);
			
			System.out.println(new A(21));
		}
		
		{
			HashMap map = new HashMap();
			map.put(a1, "Object1");
			map.put(a2, "Object2");
			map.put(a3, "Object3");
			map.put(a4, "Object4");
			
			System.out.println("map : " + map);
		}
	}
}
