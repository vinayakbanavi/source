//Reversing a String using character swap in an array

class  Q36 
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		char[] c = s1.toCharArray();

		char temp;
		for (int i = 0; i < c.length/2 ; i++ )
		{
			temp = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = temp;
		}

		s1 = new String(c);
		System.out.println(s1); 
	}
}

/*		1. Using String Cocatenation
		String s2 = "";
		
		for (int i = s1.length() - 1 ; i >= 0 ; i--)
		{
			s2 += s1.charAt(i);
	    }

		System.out.println(s2);
*/


/*		2.Using Char Array and String Concatenation
		String s2 = "";

		for (int i = c.length - 1; i >= 0 ; i-- )
		{
			s2 += c[i];
		}
		System.out.println(s2);
*/

