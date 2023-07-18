class T
{
	static int a = test();
	static int b = test();

	static int test()
	{
		System.out.println("test : " + a + ", " + b);
		b += a + 2;
		return a + b + 3;
	}

	public static void main(String[] args) 
	{
		System.out.println("main : " + a + ", " + b);
	}


}
