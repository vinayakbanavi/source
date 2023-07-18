class C4
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			Object ref = new String("abc");

			Integer obj = (Integer) ref;
			System.out.println("try end");
		}
		catch (ClassCastException ex)
		{
			System.out.println("from catch");
			ex.printStackTrace();
//          printing information about handled Exception Object
		}

		System.out.println("main end");
	}
} 

