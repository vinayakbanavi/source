//reversing a String by retaining white spaces
//Given String : abcd efg hi j
//output       : jihg fed cb a

class  Q42
{
	public static void main(String[] args) 
	{
		String s1 = "abcd efg hi j";
		String s2 = "";
		
		loop1:
		for (int i = 0; i < s1.length() ; i++)
		{
			if (s1.charAt(i) == ' ')
			{
				s2 += s1.charAt(i);
				continue loop1;
			}
			loop2:
			for (int j = s1.length() -1 - i ; j >= 0 ; j-- )
			{
				if (s1.charAt(j) == ' ')
				{
					continue loop2;
				}

				else
				{
					if (s2.indexOf(s1.charAt(j)) == -1)
					{
					s2 += s1.charAt(j);
					continue loop1;
					}
					else
					{
						continue loop2;
					}
				}
			}

		}
		System.out.println(s2);
	}
}
