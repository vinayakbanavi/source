package pack2;

public class M10 
{
	public static void main(String[] args) 
	{
		Object obj = new B();
		
		A a1 = (A) obj;
		System.out.println(1);
		B b1 = (B) obj;
		System.out.println(2);
		
		C c1 = (C) obj;
		System.out.println(3);
	}
}

// while down casting - casting below original Object type is not possible