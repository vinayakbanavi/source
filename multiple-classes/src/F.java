class Z
{
	static void test()
	{
		System.out.println("from test");
	}
}

class  F
{
	public static void main(String[] args) 
	{
		test();
		Z.test();
		System.out.println("Done");
	}
}