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
class R extends A 
{
	R()
	{
		System.out.println("R()");
	}

	R(int i)
	{
		super(12);
		System.out.println("R(int)");
	}

	public static void main(String[] args) 
	{
		R r1 = new R(10);
		System.out.println("----------");
		R r2 = new R();
	}
}

/*
A(int)
R(int)
-------------
A()
R()
*/