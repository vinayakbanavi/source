class R
{
	static int a = test();

	static int test()
	{
		System.out.println("test");
		return 100;
	}

	public static void main(String[] args) 
	{
		System.out.println("main : " + a);
	}
}

/*
test
main : 100
*/