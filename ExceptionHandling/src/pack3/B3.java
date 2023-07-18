class B3
{
	public static void main(String[] args)
	{
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	public static void test1()
	{
		System.out.println(3);
		try
		{
			test2();
		}
		catch (NumberFormatException ex)
		{
			System.out.println("from catch");
		}
		System.out.println(4);
	}
	public static void test2()
	{
		System.out.println(5);
		int i = Integer.valueOf("abc");
		System.out.println(6);
	}
}