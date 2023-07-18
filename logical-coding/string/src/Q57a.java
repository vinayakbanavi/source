/*
	Remove Alternate words given String without replace method 
*/

import java.util.Scanner;

class Q57a
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String");
		String s1 = scanner.nextLine();

		int count = 1;

		for (int i = 0; i < s1.length() ; i++ )
		{
			if (s1.charAt(i) == ' ' || i == s1.length() - 1)
			{
				if(count%2 == 0)
				{
					int temp = s1.lastIndexOf(' ', i - 1);
					s1 = s1.substring(0, temp + 1) + s1.substring(i + 1);
					i = temp;
				}

				count++;
			}
		}

		System.out.println(s1);
	}
}
