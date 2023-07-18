class E7
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		try
		{
			System.out.println("try begin");
			System.exit(0);
			System.out.println("try end");
		}
		catch (ArithmeticException arg)
		{
			System.out.println("from catch");
			return;
		}
		finally
		{
//			does not executes, even though control enters inside try
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
