class A
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String b1 = test();
		System.out.println("main end " + b1);
	}
	static String test()
	{	
		System.out.println("from test");
		return "hello";
	}
}

// all class and all interfaces