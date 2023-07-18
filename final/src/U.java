class A
{
	void test1()
	{
	}

	final void test2()
	{
	}
}  

class U extends A
{
	void test1()
	{
	}

	void test2()
	{
	}
}

// final method cannot be overrided in the subclass
// final method must be used exactly as it is