//Findout first repeated character
// input  --> hello how are you
// output --> h is first repeated character

import java.util.Scanner;

class Q46a
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a line of character : ");
		String s1 = scanner.nextLine();

		char ch1 = s1.charAt(0);
		boolean repeated = false;
		
		loop1:
		for (int i = 0; i < s1.length(); i++ )
		{
			ch1 = s1.charAt(i);
			for (int j = i+1; j < s1.length(); j++ )
			{
				if (ch1 == s1.charAt(j))
				{
					repeated = true; 
					break loop1;
				}
			}

		}
		System.out.println(repeated ? "first repeated : " + ch1 : "no repeated chars in :" + s1 );
	}
}
