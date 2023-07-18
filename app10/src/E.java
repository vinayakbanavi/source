class E
{
	public static void main(String[] args) 
	{
		if (args.length < 2)
		{
			System.out.println(" please supply 2 command line args");
			return;
		}
		String s1 = args[0];
		System.out.println("-------");
		String s2 = args[1];
		System.out.println("-------");
		System.out.println(s1);
		System.out.println(s2);
	}
}
