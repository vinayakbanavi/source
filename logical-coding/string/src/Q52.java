/*
	Check whether second one is a rotate of first one or not?

	example1 : abc cab, bca
	example2 : hello ohello, lohel, llohe, elloh

*/

import java.util.Scanner;

class  Q52
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
			

		System.out.println("Enter the first string : ");
		String s1 = scanner.nextLine();

		System.out.println("Enter the Second string : ");
		String s2 = scanner.nextLine();

		char c = s1.charAt(0);

		int j = s2.indexOf(c);

		boolean rotate = s1.length() == s2.length() && j != -1? true : false;

		for (int i = 0 ; i < s1.length() && j != -1; i++ , j++)
		{
			if (j == s2.length())
			{
				j = 0;
			}
			if (s1.charAt(i) != s2.charAt(j))
			{
				rotate = false;
				break;
			}
		}

		System.out.println(rotate ? s2 + " is a rotate of " + s1 : s2 + " is not a rotate of " + s1);
	}
}
