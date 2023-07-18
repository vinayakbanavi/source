class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int b1 = test();
		System.out.println("main end " + b1);
	}
	static byte test()
	{	
		System.out.println("from test");
		return 40;
	}
}