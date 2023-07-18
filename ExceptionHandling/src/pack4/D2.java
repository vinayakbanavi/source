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

class D2 extends A
{
	void test1() throws ArithmeticException
	{
		System.out.println("overrided test1() throws NullPointerException");
	}

	void test2() throws ClassCastException
	{
		System.out.println("overrided test2() throws ClassNotFoundException");
	}

	void test3() throws NullPointerException
	{
		System.out.println("overrided test3() throws InterruptedException");
	}
	void test4() throws IndexOutOfBoundsException
	{
		System.out.println("overrided test4() throws Exception");
	}
	void test5() throws NumberFormatException
	{
		System.out.println("overrided test5()");
	}

	public static void main(String[] args)
	{
		D2 obj = new D2();

		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		
	}
}

// Any method can override by choosing throws as unchecked no matter that method in super class throws checked or unchecked 