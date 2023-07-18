class S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if ( args.length == 0)
		{
			System.out.println("supply one int command line argument");
			return;
		}
		int i = Integer.parseInt(args[0]);
		System.out.println("Square root of " + i + " is : " + Math.sqrt(i));
	}
}
