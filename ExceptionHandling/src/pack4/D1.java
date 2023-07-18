package pack4;

class A
{
	void test1() throws NullPointerException
	{
	}

	void test2() throws ClassNotFoundException
	{
	}

	void test3() throws InterruptedException
	{
	}

	void test4() throws Exception
	{
	}

	void test5()
	{
	}
}

class D1 extends A
{
	void test1()
	{
		System.out.println("overrided test1() throws NullPointerException");
	}

	void test2()
	{
		System.out.println("overrided test2() throws ClassNotFoundException");
	}

	void test3()
	{
		System.out.println("overrided test3() throws InterruptedException");
	}
	void test4()
	{
		System.out.println("overrided test4() throws Exception");
	}
	void test5()
	{
		System.out.println("overrided test5()");
	}

	public static void main(String[] args)
	{
		D1 obj = new D1();

		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		
	}
}

// Any method can be overrided in the subclass without throws no matter Super class method throwing checked/unchecked Exception