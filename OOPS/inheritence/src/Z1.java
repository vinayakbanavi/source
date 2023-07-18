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

class Z1
{
	public static void main(String ... args)
	{
//		Auto upcasting
		A a1 = new B();
// static members are resolved during compilation based on reference variable
// non static members get resolved during runtime based on Object type

		a1.test();
	}
}
