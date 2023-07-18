class N 
{
	int i;

	static void test()
	{
		N n1 = new N();
		n1.i = 10;

		N n2 = new N();
		n2.i = 20;

		System.out.println("from test : " + n1.i + ", " + n2.i);
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}

//any number of objects can be created in any method