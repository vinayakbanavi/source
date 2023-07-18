class A2
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}
	public static void test()
	{
		System.out.println(3);

		try
		{
			int i = 10/0;
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch");
		}
		System.out.println(4);
	}
}

// Handling the rised Object at the place of origin itself