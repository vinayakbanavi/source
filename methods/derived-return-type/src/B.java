class B
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int b1 = test();
		System.out.println("main end " + b1);
	}
	static Integer test()
	{	
		System.out.println("from test");
		return 100;
	}
}

// all class and all interfaces