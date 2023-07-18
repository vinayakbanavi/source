package pack5;

class A2 
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
//			some statements
//			RETHROW :
//			if throw is there in catch body
			throw new ArithmeticException(ex.getMessage());
		}

		System.out.println("main end");
	}
}
