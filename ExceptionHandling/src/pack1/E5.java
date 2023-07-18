class E5
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		try
		{
			System.out.println("try begin");
			System.out.println("try end");
			return;
		}
		catch (ArithmeticException arg)
		{
			System.out.println("from catch");
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
