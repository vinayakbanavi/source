/*
Read the words from both the ends one by one
Given String "abc hello 123 test java btm j2ee placements hardwork"
output - abc hardwork hello placements 123 j2ee test btm java
*/

class Q33b 
{
	public static void main(String[] args) 
	{
		String s1 = "abc hello 123 test java btm j2ee placements hardwork";

		
		int fromindex = 0;
		int toindex = s1.indexOf(' ');
		String word;
		
		int fromindex1 = s1.lastIndexOf(' ');
		int toindex1 = s1.length();
		String word1;

		while (fromindex - 1 < fromindex1)
		{
			word = (s1.substring(fromindex, toindex));
			fromindex = toindex + 1;
			toindex = s1.indexOf(' ', fromindex);
			
			word1 = s1.substring(fromindex1 + 1, toindex1);
			toindex1 = fromindex1;
			fromindex1 = s1.lastIndexOf(' ', fromindex1 - 1);

			System.out.print(word + " ");
			System.out.print (word1 + " ");
		}

		if (fromindex - 1 == fromindex1)
		System.out.print(s1.substring(fromindex,toindex)); 

	}
}

/*
	comparison of two string values
	if (word.equals(word1))
			{
				break;
			}
*/