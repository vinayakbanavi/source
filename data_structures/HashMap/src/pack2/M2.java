package pack2;

import java.util.HashMap;

class B
{
	int id;
	
	B(int id)
	{
		this.id = id;
	}
	
	public String toString()
	{
		return id + "";
	}
}

public class M2 
{
	public static void main(String[] args) 
	{
		B b1 = new B(150);
		B b2 = new B(150);
		B b3 = new B(250);
		B b4 = new B(250);
		B b5 = new B(350);
		
//		printing the reference or new Object after overriding toString()
		{
			System.out.print(b1 + " ");
			System.out.print(b2 + " ");
			System.out.print(b3 + " ");
			System.out.print(b4 + " ");
			System.out.print(b5 + " ");
			
			System.out.println(new B(100));
		}
		
//		adding Object to the Map after overriding toString()
		System.out.println("\nGetting members of the object instead of Objects memory Address\n");
		{
			HashMap map = new HashMap();
			map.put(b1, "Object1");
			map.put(b2, "Object2");
			map.put(b3, "Object3");
			map.put(b4, "Object4");
			map.put(b5, "Object5");
			
			System.out.println("map : " + map);
//			from above print we can observe that HashMap is failing to differentiate between member of the object
//			Because HashMap won't allow duplicate keys, if key is same value will get updated
//			in order to fix this we need to override hashCode() and equals()
		}
	}
}
