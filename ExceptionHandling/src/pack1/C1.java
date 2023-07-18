class C1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			String s1 = null;
			int i = s1.length();
			System.out.println("try end");
		}
		catch (NullPointerException ex)
		{
			System.out.println("from catch");
			ex.printStackTrace();
//          printing information about handled Exception Object
		}

		System.out.println("main end");
	}
}
//catch should be compatible type of rised exception