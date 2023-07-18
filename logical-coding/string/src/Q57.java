/*
	print alternate words
*/

import java.util.Scanner;

class Q57
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String");
		String s1 = scanner.nextLine();


		int from = 0;
		int to = s1.indexOf(' ');
		String word;
		int count = 1;
		
		if (to == -1)
		{
			System.out.println(s1);
			return;
		}

		while (to != -1)
		{
			if (s1.charAt(from) != ' ')
			{
				word = s1.substring(from, to);

				if(count%2 != 0)
				System.out.println(word);

				count++;
			}

			if (to == s1.length())
			{
				break;
			}

			from = to + 1;
			to = s1.indexOf(' ', from) != -1 ? s1.indexOf(' ', from) : s1.length();
		}
	}
}
