class  G
{
	public static void main(String[] args) 
	{
		if (args.length == 0)
		{
		  System.out.println(" please supply one int command line arg");
		  return;
		}
		String s1 = args[0];
		int i = Integer.parseInt(s1);	
		System.out.println(Math.sqrt(i));
	}
}

//parseInt converting string type to int type