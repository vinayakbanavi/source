/*
Read the words from both the ends one by one
Given String "abc hello 123 test java btm j2ee placements hardwork"
output - abc hardwork hello placements 123 j2ee test btm java
*/
class Q33
{
	public static void main(String[] args) 
	{
		String s1 = "abc hello 123 test java btm j2ee placements hardwork";
		           //0123456789111111111122222222223333333333444444444455
				   //          012345678901234567890123456789012345678901

		int fromindex = 0;
		int toindex = s1.indexOf(' ');
		String word;
		
		int fromindex1 = s1.lastIndexOf(' ');
		int toindex1 = s1.length();
		String word1;

		char c = ' ';
        int index = s1.indexOf(c);
		int count = 0,count1 = 1;

		while (index != -1)
		{
			count++;
			index = s1.indexOf(c, index+1);
		}
        
		while (toindex != -1 && count1 <= count/2 )
		{
			count1++;
			word = (s1.substring(fromindex, toindex));
			fromindex = toindex + 1;
			toindex = s1.indexOf(' ', fromindex);

			word1 = s1.substring(fromindex1 + 1, toindex1);
			toindex1 = fromindex1;
			fromindex1 = s1.lastIndexOf(' ', fromindex1 - 1);

			System.out.print(word + " ");
			if (toindex < s1.length()/2);
			System.out.print(word1 + " ");
		}

		if (count%2 == 0)
		System.out.println(s1.substring(fromindex, toindex));
		else
		{
		System.out.print(s1.substring(fromindex, toindex));
		System.out.println(s1.substring(fromindex1, toindex1));
		}
	}
}
