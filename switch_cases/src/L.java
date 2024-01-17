class L 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		int j = 10;
		switch (i)
		{
			case 1:
				System.out.println("from case 1");
				break;
			case j:
				System.out.println("from case 2");
				break;
		
		}
		System.out.println("main end");
	}
}

//ERROR - CONSTANT EXPRESSION REQUIRED
// CASE ARGUMENT SHOULD NOT BE VARIABLE
