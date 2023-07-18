class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double b1 = test();
		System.out.println("main end " + b1);
	}

	static double test()
	{	
		System.out.println("from test");
		return 25.6;
	}
}