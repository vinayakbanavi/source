package pack2;

public class M9
{
	public static void main(String[] args) 
	{
		A a1 = new B();
		System.out.println(1);
		B b1 = (B) a1;
		System.out.println(2);
		C c1 = (C) a1;
		System.out.println(3);
	}
}

// Level of upcasting and level of downcasting should be same