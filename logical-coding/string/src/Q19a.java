class Q19a
{
	public static void main(String[] args) 
	{
		String s1 = "hello java, how are you???";
		
		String vowelsStr = "aeiou";
        
		int index, count;
		char vowel;

		for (int i = 0 ; i < vowelsStr.length() ; i++)
		{   
			count = 0;
			vowel = vowelsStr.charAt(i);
			index= s1.indexOf(vowel);

			while (index != -1)
			{
				count++;
				index = s1.indexOf(vowel, index + 1);
			}

			if (count != 0)
			{
				System.out.println(vowel + " available in " + count + " times");
			}
		}
	}
}
