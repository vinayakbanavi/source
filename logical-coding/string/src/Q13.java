//Reading from both the ends one by one

class Q13
{
	public static void main(String[] args) 
	{
		String s1 = "abcdefghij";
		           //0123456789

	 // s1.length() = 10
		
		System.out.println(s1);

		for (int i = 0; i < s1.length()/2 ; i++ )
		{
			System.out.print(s1.charAt(i));
			System.out.print(s1.charAt(s1.length() - i - 1));
		}
		
	}
}
