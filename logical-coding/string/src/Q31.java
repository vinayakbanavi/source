//read words by words from a given string 

class Q31 
{
	public static void main(String[] args) 
	{
		String s1 = "abc hello 123 test java btm j2ee placements hardwork";
		int fromindex = 0;
		int toindex = s1.indexOf(' ');
		String word;
		while (toindex != -1)
		{
			word = s1.substring(fromindex, toindex);
			System.out.println(word);
			fromindex = toindex + 1;
			toindex = s1.indexOf(' ',fromindex);
		}
		System.out.println(s1.substring(fromindex,s1.length()));
		
	}
}
