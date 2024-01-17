class K 
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
    		if (true)
	        {
	         	System.out.println("if1 begin");
			if (true)
			{
				System.out.println("if2 begin");
				if (true)
				{
					System.out.println("if3 begin");
					System.out.println("if3 end");
				}
				System.out.println("if2 end");
			}
			System.out.println("if1 end");
	        }
		System.out.println("main end");
	}
}
