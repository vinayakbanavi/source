class A6
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
			test();
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("from catch");
		}
		System.out.println(2);
	}

	public static void test()
	{
		System.out.println(3);
//		checked : ClassNotFoundException
//      by default must be handled at the place of rise or compiler will look for try catch 
		Class.forName("");
		System.out.println(4);
	}
}

/*
		F.java:10: error: exception ClassNotFoundException is never thrown in body of corresponding try statement
                catch (ClassNotFoundException ex)
       
		F.java:20: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                Class.forName("");
*/