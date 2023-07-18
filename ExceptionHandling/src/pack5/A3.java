package pack5;

class A3 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		try
		{
			System.out.println("try begin");
//			not a meaningfull way of design 
			if (true)
			{
				throw new ArithmeticException();
			}
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
//			some statements
		}
 
		System.out.println("main end");
	}
}
