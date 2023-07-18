class B8
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
		catch (ArithmeticException ex)
		{
			System.out.println("from catch " + ex.getMessage());
//          printing information about handled Exception Object
		}

		System.out.println("main end");
	}
}