// Check whether Given String is pangram or not

import java.util.Scanner;

class  Q50b
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = scanner.nextLine();
		
		char c;
		int index;
		boolean[] alphabetStatus = new boolean[26];
		
		for (int i = 0; i < s1.length() ; i++ )
		{
			c = s1.charAt(i);

			if (c >= 'A' && c <= 'Z')
			{
				index = c - 'A';
			}
			else if (c >= 'a' && c <= 'z')
			{
				index = c - 'a';
			}
			else
			{
				continue;
			}

			alphabetStatus[index] = true;
		}

		boolean pangram = true;

		for (int i = 0; i < alphabetStatus.length ; i++ )
		{
			if (alphabetStatus[i] == false)
			{
				pangram = false;
				break;
			}
		}
		System.out.println();
		System.out.println(pangram ? "String is a pangram" : "String is not a pangram");
	}
}
