class M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		final int j = 10;
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

//final will make the variable constant
//final variables are treated as a constant
