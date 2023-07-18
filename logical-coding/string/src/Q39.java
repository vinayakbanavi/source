// Important! --> Reversing a String using Recursion without global variable

class Q39 
{
	public static void main(String[] args) 
	{
		String s1 = "abcdef";
		String s2 = reverse(s1);
		System.out.println(s1);
		System.out.println(s2);
	}

	public static String reverse(String str)
	{
		if (str.length()  == 0)
		{
			return "";
		}

		return str.charAt(str.length() - 1) + reverse(str.substring(0,str.length() - 1));
	}
}

/*
class Q39 
{
	public static void main(String[] args) 
	{
		String s1 = "abcdef";
		System.out.println(s1);
		reverse(s1,"");
	}
	public static void reverse(String s1, String s2)
	{
		if (s1.length() == 0)
		{
			System.out.println(s2  -);
			return;
		}

		s2 += s1.charAt(s1.length() - 1);
		reverse(s1.substring(0,s1.length() -1) , s2);
	}
}
*/  