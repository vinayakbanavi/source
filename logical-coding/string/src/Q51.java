// Check whether Given String is pangram or not and print missing character

import java.util.Scanner;

class  Q51
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = scanner.nextLine();

		boolean pangram = true;
		String absent = "";
		
		for (char c1 = 'A', c2 = 'a'; c1 <= 'Z' ; c1++ , c2++)
		{	
			if (s1.indexOf(c1) == -1 && s1.indexOf(c2) == -1)
			{
				absent += c1 + ", ";
				pangram = false;
			}
		}
		if (!pangram)
		System.out.println("Missed chars to make a pangram : " + absent.substring(0, absent.length() - 2));

		System.out.println(pangram ? "String is a pangram" : "String is not a pangram");
	}
}
