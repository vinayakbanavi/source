class N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		final int j;
		j = 50;
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

//ERROR - CANNOT ASSIGN VALUE TO FINAL VARIABLE J
//ERROR - CONSTANT EXPRESSION REQUIRED
