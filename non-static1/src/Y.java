class Y 
{
	void test()
	{
		this();
		System.out.println("Y - test()");
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

// this() can not be developed in a method body, call to this is only restricted to constructor body