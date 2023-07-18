class X
{

//  error: varargs parameter must be the last parameter
	static void test(String ... arg, int i)
	{
		System.out.println("from test   : " + i);
		System.out.println("arg length : " + arg.length );

		for(String s1 : arg)
		{
			System.out.print(s1 + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) 
	{
		test(0);
	}
}
