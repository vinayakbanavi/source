class F1 
{
	public static void main(String[] args) 
	{
		try
		{
			int i = 10/0;
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch");
		}
		finally
		{
			return;
	//		System.exit(0);
		}
		System.out.println("Hello World!");
	}
}
