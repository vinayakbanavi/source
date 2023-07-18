// Check whether Given String is pangram or not

import java.util.Scanner;

class  Q50a
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = scanner.nextLine();

		boolean pangram = true;
		
		for (char c1 = 'A', c2 = 'a'; c1 <= 'Z' && c2 <= 'z' ; c1++ , c2++)
		{	
			if (s1.indexOf(c1) == -1 && s1.indexOf(c2) == -1)
			{
				pangram = false;
				break;
			}
		}
		System.out.println(pangram ? "String is a pangram" : "String is not a pangram");
	}
}
