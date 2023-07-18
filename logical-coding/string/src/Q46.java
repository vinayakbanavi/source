//Findout first repeated character
// input  --> hello how are you
// output --> h is first repeated character

import java.util.Scanner;

class Q46 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a line of character : ");
		String s1 = scanner.nextLine();

		char ch1,ch2;

		for (int i = 0; i < s1.length() - 1; i++ )
		{
			ch1 = s1.charAt(i);
			for (int j = i+1; j < s1.length(); j++ )
			{
				ch2 = s1.charAt(j);
				if (ch1 == ch2)
				{
					System.out.println(ch1 + "- is first repeated character"); 
					return;
				}
			}
		}
		System.out.println("No repeated character");
	}
}
