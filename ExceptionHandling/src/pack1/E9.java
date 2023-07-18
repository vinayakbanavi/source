class E9
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		try
		{
			System.out.println("try begin");
			throw new Exception();
			System.out.println("try end");
		}
		finally
		{
			System.out.println("from finally");
		}
//		We cannot develop any statements after finally in the design of try with finally if rised ExceptionObject not handled in catch 
		System.out.println("main end");

	}
}
