//reading all character in the reverse order from a String
//using length() and charAT() methods

class Q8
{
	public static void main(String[] args) 
	{
		String s1 = "hello abc";
		           //012345678

	  // s1.length() = 9

		for (int i = s1.length() - 1; i >= 0 ; i-- )
		{
			System.out.print(s1.charAt(i));
		}

		System.out.println(s1);
		
	}
}
