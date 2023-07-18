package pack2;

public class M11
{
	public static void main(String[] args) 
	{
		A a1 = new B();
		System.out.println(a1 instanceof Object);
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof C);
	}
}

// instanceof is an Boolean operator which will check Object type