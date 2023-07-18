class E6
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
			return;
		}
		finally
		{
//			executes despite of return inside try;
//			finally executes without fail once control enters inside the try.
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
