class Q42a 
{
	public static void main(String[] args) 
	{
		String s1 = "abcd efg hi j";
		           //jihg fed cb a
		String s2 = "";
		String s3 = "";
		int j = 0;

		for (int i = s1.length() -1; i >= 0 ; i--)
		{
			if (s1.charAt(i) != ' ')
			s2 += s1.charAt(i);
		}

		for (int i = 0 ; i < s1.length() ; i++ )
		{
			if (s1.charAt(i) != ' ')
			{
				s3 += s2.charAt(j++);			
			}
			
			else
			{
				s3 += ' ';
			}
		}
		System.out.println(s3);
	}
}
