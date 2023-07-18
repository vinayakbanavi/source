// Reversing the string retaining blank spaces At orignal position
// Argument - "abcd efg hi j"
// output   - "jihg fed cb a"

class Q42b 
{
	public static void main(String[] args) 
	{
		String s1 = "ab c";
		String s2 = "";
		int j = s1.length() - 1;

		for (int i = 0; i < s1.length() ; i++)
		{
			if (s1.charAt(i) != ' ')
			{	
				while(s1.charAt(j) == ' ')
				{
					j--;
				}
				s2 += s1.charAt(j--);
			}

			else
			{
				s2 += ' ';
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}
