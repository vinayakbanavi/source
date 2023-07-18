//Reading the words from the given string in reverse order

class Q32 
{
	public static void main(String[] args) 
	{
		String s1 = "abc hello 123 test java btm j2ee placements hardwork";

		int fromindex = s1.lastIndexOf(' ');
		int toindex = s1.length();
	
		String word;

		while (fromindex != -1)
		{
			word = s1.substring(fromindex + 1, toindex);
			System.out.println(word);
			toindex = fromindex;
			fromindex = s1.lastIndexOf(' ', fromindex - 1);
		}
		System.out.println(s1.substring(0, toindex));
	}
}
