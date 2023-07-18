// Check whether Given String is pangram   or not

import java.util.Scanner;

class  Q50a
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = scanner.nextLine();
		
		char c;
		boolean pangram = true;
		
		loop1:
		for (char c1 = 'A', c2 = 'a'; c1 <= 'Z' && c2 <= 'z' ; c1++ , c2++)
		{	
			for (int i = 0 ; i < s1.length() ; i++ )
			{
				c = s1.charAt(i);
				
				if (c == c1 || c == c2)
				{
					continue loop1;
				}
			}

			pangram = false;
			break;
		}
		System.out.println(pangram ? "String is a pangram" : "String is not a pangram");
	}
}
