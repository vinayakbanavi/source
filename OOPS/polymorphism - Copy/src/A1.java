class  A
{
	void test()
	{
		System.out.println("A- test()");
	}

	static void test1()
	{
		System.out.println("A- static test1()");
	}
}
class  B extends A
{
	void test()
	{
		System.out.println("B- test()");
	}

	static void test1()
	{
		System.out.println("B- static test1()");
	}
}
class  A1
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		A a1 = new A();
		A a2 = new B();

		b1.test();
		b1.test1();

		a1.test();
		a1.test1();

		a2.test();
		a2.test1();

	}
}