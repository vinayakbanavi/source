/*
Read the words one by one from the given String without split method 
*/

import java.util.Scanner;

class Q54 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String");
		String s1 = scanner.nextLine();


		int from = 0;
		int to = s1.indexOf(' ');
		String word;
		
		if (to == -1)
		{
			System.out.println(s1);
			return;
		}

		while (to != -1)
		{
			word = s1.substring(from, to);
			System.out.println(word);


			if (to == s1.length())
			{
				break;
			}

			from = to + 1;
			to = s1.indexOf(' ', from) != -1 ? s1.indexOf(' ', from) : s1.length();
		}
	}
}
