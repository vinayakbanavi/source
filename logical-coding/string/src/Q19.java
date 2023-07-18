class Q19
{
	public static void main(String[] args) 
	{
		String s1 = "hello java, how are you???";
		
		String vowelsStr = "aeiou";
        
		int count,index;
		char vowel;
		String occurances;

		for (int i = 0 ; i < vowelsStr.length() ; i++)
		{   
			occurances = "";
			count = 0;
			vowel = vowelsStr.charAt(i);
			index= s1.indexOf(vowel);
			
			while (index != -1)
			{
				occurances = occurances + index;
				count++;
				index = s1.indexOf(vowel, index + 1);
				if (index != -1)
				{
					occurances += ", ";
				}
			}

			if (count != 0)
			{
				System.out.println(vowel + " available " + count + " times at " + "(" +occurances+")");
			}
		}
	}
}
