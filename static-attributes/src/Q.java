class Q 
{
	static int a = test();

	static int test()
	{
		return 100;
	}

	public static void main(String[] args) 
	{
		System.out.println("main : " + a);
	}
}
