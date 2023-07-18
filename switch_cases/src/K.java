class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (args.length == 0)
		{
			System.out.println("please supply number between 1 to 10 only");
			return;
		}

		int i = Integer.parseInt(args[0]);
		switch(i)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
				System.out.println(i + " is odd");
			    break;
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
				System.out.println(i + " is even");
			    break;
		}
		System.out.println("main end");
	}
}
