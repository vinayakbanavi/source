class A4
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
		Class.forName("");
		System.out.println(4);
	}
}
