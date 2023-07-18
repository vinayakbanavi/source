class W 
{

// var Args must be the last argument
// there can be only one var arg in arguments 
	static void test(int i , String ... arg)
	{
		System.out.println("from test   : " + i);
		System.out.println("arg length  : " + arg.length );

		for(String s1 : arg)
		{
			System.out.print(s1 + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) 
	{
		test(0);
		System.out.println("---------------------");

		test(1, "Hello");
		System.out.println("---------------------");

		test(2, "Hello", "How");
		System.out.println("---------------------");

		test(3, "Hello", "How", "are");
		System.out.println("---------------------");

		test(4, "Hello", "How", "are", "you");
	}
}
