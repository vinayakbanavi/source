// Finding out index no of vovels in a string

class Q18 
{
	public static void main(String[] args) 
	{
		String s1 = "hello java, how are you???";

		for (int i = 0; i < s1.length() ; i++ )
		{
			char v = s1.charAt(i);
			if (v == 'a' ||v == 'e' ||v ==  'i' ||v == 'o' ||v =='u')
			{
				System.out.print(s1.charAt(i) + " ");
				System.out.println("is available at index : " + i);
			}
			
		}
	}
}
