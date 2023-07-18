//Findout first non repeated character
// input  --> hello how are you
// output --> w is first non repeated character

import java.util.Scanner;

class Q47b
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a line of character : ");
		String s1 = scanner.nextLine();
		
		char c1 = s1.charAt(0);
		boolean nonrepeated = false;

		loop1:
		for (int i = 0; i < s1.length() ; i++ )
		{
			c1 = s1.charAt(i); 

			for (int j = i - 1 ; j >= 0 ; j-- )
			{
				if (c1 == s1.charAt(j))
				{ 
				//	System.out.println(c1 + ", " + s1.charAt(j));
					continue loop1;
				}
			}

			for (int j = i + 1; j < s1.length() ; j++ )
			{
				if (c1 == s1.charAt(j))
				{
				//	System.out.println(c1 + ", " + s1.charAt(j));
					continue loop1;
				}
			}
			
			//	System.out.println(c1);
			if (c1 != ' ')
			{
				nonrepeated = true;
				break;
			}
		} 
		System.out.println(nonrepeated ?"First non repeated character : " + c1 : "all chars repeated in : " + s1);
	}
}
