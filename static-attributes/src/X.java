class X 
{
	static int i = test();

	public static int test()
	{
		System.out.println("from test");
		main(null);                     // calling main method explicitly from the initializer
		return 100;
	}
	public static void main(String[] args) 
	{
		System.out.println("main : " + i);
	}
}
