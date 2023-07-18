class Q23 
{
	public static void main(String[] args) 
	{
		if (args.length < 2)
		{
			System.out.println("please supply Two string args");
			return;
		}
		String s1 = args[0];
		String s2 = args[1];

		System.out.println("Given String : ");
		System.out.println("First one : " + s1);
		System.out.println("Second one : " + s2);
		
		int count = 0;
		int i = s1.indexOf(s2);
		String occurances = "";
		
		while (i != -1)
		{
			count ++;
			occurances += i;
			i = s1.indexOf(s2, i+1);
	    	if (i != -1)
	    	{
				occurances += ", ";
	     	}
		}
		System.out.println("\""+s2+ "\"" + " is available " + count + " times" + "(" + occurances + ")");

	}
}
