//Reversing a String Using String Cocatenation

class Q37 
{
	public static void main(String[] args) 
	{
		String s1 ="Hello World!";
        System.out.println(s1);

		String s2 = "";
		
		for (int i = s1.length() - 1 ; i >= 0 ; i--)
		{
			s2 += s1.charAt(i);
	    }

		System.out.println(s2);
	}
}
 