/*
Read the words one by one from the given String without split method 
*/

import java.util.Scanner;

class Q55
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String");
		String s1 = scanner.nextLine();


		int from = 0;
		
		String word;
		
		while (s1.charAt(from) == ' ')
		{
			from++;
		}

		int to = s1.indexOf(' ', from);

		while (to != -1)
		{
			word = s1.substring(from, to);
			System.out.println(word);

			
			if (to == s1.length())
			{
				break;
			}

			from = to + 1;
			while (s1.charAt(from) == ' ' && from < s1.length() - 2)
			{
				from++;
			}
			to = s1.indexOf(' ', from) != -1 ? s1.indexOf(' ', from) : s1.length();
		}
	}
}
