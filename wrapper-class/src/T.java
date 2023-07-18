// Var args

class T 
{
	static void test(byte ... args)
	{
		System.out.println("from var args");
	}

	public static void main(String[] args) 
	{
		byte b1 = 10;
		byte b2 = 10;
		byte b3 = 10;
		byte b4 = 10;
		byte b5 = 10;
		test(b1);
		test(b1, b2);
		test(b1, b2, b3);
		test(b1, b2, b3, b4);
		test(b1, b2, b3, b4, b5);

	}
}
