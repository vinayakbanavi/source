/*
Read the words from both the ends one by one
Given String "abc hello 123 test java btm j2ee placements hardwork"
output - abc hardwork hello placements 123 j2ee test btm java
*/
class Q33a
{
	public static void main(String[] args) 
	{
		String s1 = "abc hello lara 123 test";

		int fromindex = 0;
		int toindex = s1.indexOf(' ');
		String word;
		
		int fromindex1 = s1.lastIndexOf(' ');
		int toindex1 = s1.length();
		String word1;

        int index = s1.indexOf(' ');
		int count = 0,count1 = 1,count2;

		while (index != -1)
		{
			count++;
			index = s1.indexOf(' ', index+1);
		}

		count2 = count;

		if (count%2 != 0)
			count += 1;
        
		while (count1 <= count/2 )
		{
			count1++;
			word = (s1.substring(fromindex, toindex));
			fromindex = toindex + 1;
			toindex = s1.indexOf(' ', fromindex);

			word1 = s1.substring(fromindex1 + 1, toindex1);
			toindex1 = fromindex1;
			fromindex1 = s1.lastIndexOf(' ', fromindex1 - 1);

			System.out.print(word + " ");
			System.out.print(word1 + " ");
		}
        
		if (count2%2 == 0)
		System.out.println(s1.substring(fromindex, toindex) + " ");

	}
}
