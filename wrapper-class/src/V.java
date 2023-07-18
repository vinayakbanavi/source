// Var args

class V
{
	static void test(byte ... args)
	{
		for (int i = 0; i < args.length ; i++)
		{
			System.out.print(args[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = 30;
		byte b4 = 40;
		byte b5 = 50;
		test(b1);
		test(b1, b2);
		test(b1, b2, b3);
		test(b1, b2, b3, b4);
		test(b1, b2, b3, b4, b5);

	}
}

