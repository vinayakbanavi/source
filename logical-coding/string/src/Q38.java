 //Reversing a String using Recursion

class Q38  
{
	static String s2 = "";
	
	public static void main(String[] args)
	{
		String s1 ="abcdef";
		System.out.println(s1);
		reverse(s1);
		System.out.println(s2);
	}
	
	static void reverse(String s1)
	{
		if (s1.length() == 0)
		{
			return;
		}
		s2 += s1.charAt(s1.length() - 1);
		reverse(s1.substring(0, s1.length() - 1));
	}
}
