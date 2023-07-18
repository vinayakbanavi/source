class D1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10/0;
		try
		{
			System.out.println("try begin");
			System.out.println("try end");
		}
		catch (NullPointerException ex)
		{
			System.out.println("from catch : exception handled");
		}
		System.out.println("main end");
	}
}
