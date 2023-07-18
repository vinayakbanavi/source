class S
{
	static int a = test();

	static void test()
	{
		System.out.println("test : " + a);
		a = 10;
		return a + 20;
	}

	public static void main(String[] args) 
	{
		System.out.println("main : " + a);
	}
}
