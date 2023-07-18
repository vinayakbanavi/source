class A 
{
	static 
	{
		System.out.println("from A");
	}

	static void test()
	{
		System.out.println("from A test()");
	}
}

class B extends A 
{
	static
	{
		System.out.println("from B");
	}

	static void test()
	{
		System.out.println("from B test()");
	}
}

class Z
{
	public static void main(String ... args)
	{
		B b1 = new B();
		b1.test();
	}
}
