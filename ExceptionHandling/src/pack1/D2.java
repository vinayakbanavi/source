class D2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			System.out.println("try end");
		}
		int i = 10/0; 
		catch (ArithmeticException ex)
		{
			System.out.println("from catch : exception handled");
		}
		System.out.println("main end");
	}
}
