class C5
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = Integer.parseInt("123r");
			System.out.println("try end");
		}
		catch (NumberFormatException ex)
		{
			System.out.println("from catch");
			ex.printStackTrace();
//          printing information about handled Exception Object
		}

		System.out.println("main end");
	}
} 