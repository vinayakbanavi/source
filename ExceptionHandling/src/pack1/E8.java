class E8
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		try
		{
			System.out.println("try begin");
			int i = 10/0;
			System.out.println("try end");
		}
		catch (ArithmeticException arg)
		{
			System.out.println("from catch");
			System.exit(0);
		}
		finally
		{
//			does not executes, even though control enters inside try
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
