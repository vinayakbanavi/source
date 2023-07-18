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

class D3 extends A
{
	void test1() throws ClassNotFoundException
	{
		System.out.println("overrided test1() throws NullPointerException");
	}
}

// We cannot override a method throwing unchecked in superclass by throwing checked
// We can only override a method throwing checked by throwing checked of same class as Superclass method Exception or subclass to that Exception

/*
		error: test1() in D3 cannot override test1() in A
        void test1() throws ClassNotFoundException
             ^
		overridden method does not throw ClassNotFoundException
*/