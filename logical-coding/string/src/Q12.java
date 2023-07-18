// Reading first 3 characters  and last 3 characters
// one from the first and one from the last, like wise 3 from the first and 3 from the last

class Q12
{
	public static void main(String[] args) 
	{
		String s1 = "abcdefghij";
		           //0123456789
	  // s1.length() = 10
        
		System.out.println(s1);

		for (int i = 0; i <= 2 ; i++ )
		{
			System.out.print(s1.charAt(i));
			System.out.print(s1.charAt(s1.length() - (i + 1)));
		}
		System.out.println();
	}
}