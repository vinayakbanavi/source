class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		boolean b1 = test();
		System.out.println("main end");
	}

	static int test()
	{	
		System.out.println("from test");
		int i = 25 + 50;
		return i;
	}
}
