class Q21 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello Java, How are you?";
		String s2 = "Java";

		int i = s1.indexOf(s2);

		if (i != -1)
		{
			System.out.println(s2 + " is available at " + i);

		}
		else
		{
			System.out.println(s2 + " is not available");
		}
	}
}
