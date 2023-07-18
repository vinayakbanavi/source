class C8
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
		catch (NullPointerException ex)
		{
			System.out.println("from catch : exception handled");
		}
		System.out.println("main end");
	}
}
