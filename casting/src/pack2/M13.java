package pack2;

public class M13
{
	public static void main(String[] args) 
	{
		Object o1 = new B();
		
		if (o1 instanceof Object)
		{
			System.out.println("Converting into Object");
			Object o2 = (Object) o1;
		}
		if (o1 instanceof A) 
		{
			System.out.println("Converting into A");
			A a1 = (A) o1;
		}
		
		if (o1 instanceof B) 
		{
			System.out.println("Converting into B");
			B b1 = (B) o1;
		}
		
		if (o1 instanceof C) 
		{
			System.out.println("Converting into C");
			C c1 = (C) o1;
		}
	}
}
