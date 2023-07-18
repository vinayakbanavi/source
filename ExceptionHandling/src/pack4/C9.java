package pack4;

class C9
{
	void test1() throws Exception
	{
	}

	void test2() throws Throwable
	{
	}

	void test3()
	{
		test1();
	}

	void test4()
	{
		test2();
	}
}

// Exception and Throwable acting as perfect checked in case of method() throws
// We cannot call method throwing checked Exception directly