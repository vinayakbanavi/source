class A 
{
	A()
	{
		System.out.println("A()");
	}

	A(int i)
	{
		System.out.println("A(int)");
	}
}
class U extends A 
{
	U()
	{
		super(90);
		System.out.println("U()");
	}

	U(int i)
	{
		this();  // if already super() or this() is present inside a constructor,compiler will not develop super()
		System.out.println("U(int)");
	}

	public static void main(String[] args) 
	{
		U u1 = new U(10);
		System.out.println("----------");
		U u2 = new U();
	}
}

/*
A(int)
U()
U(int)
-----------
A(int)
U()
*/