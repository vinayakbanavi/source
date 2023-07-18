/*
	Remove Alternate words in the given String without replace method 
*/

import java.util.Scanner;

class Q57b
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String");
		String s1 = scanner.nextLine();

		int count = 1;

		for (int from = 0; from <s1.length() ; from = to)
		{
			int to = s1.indexOf(' ', from + 1) != -1 ?  s1.indexOf(' ', from + 1) : s1.length();

			if (count%2 == 0)
			{
				s1 = s1.substring(0, from) + s1.substring(to);
				to = from;
			}
			count++;
		}
		System.out.println(s1);
	}
}
