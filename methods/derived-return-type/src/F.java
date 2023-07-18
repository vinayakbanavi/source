class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Runnable b1 = test();
		System.out.println("main end " + b1);
	}
	static Runnable test()
	{	
		System.out.println("from test");
		return null;
	}
}

