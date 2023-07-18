/*
	Remove All the white spaces in the given String without replace method 
*/

import java.util.Scanner;

class Q56
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String");
		String s1 = scanner.nextLine();

		for (int i = 0; i < s1.length() ; i++ )
		{
			if (s1.charAt(i) == ' ')
			{
				s1 = s1.substring(0, i) + s1.substring(i+1))
					i--;
			}
		}

		System.out.println(s1);
	}
}
