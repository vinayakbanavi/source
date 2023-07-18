/*
	Check whether second one is a rotate of first one or not?

	example1 : abc cab, bca
	example2 : hello ohello, lohel, llohe, elloh

*/

import java.util.Scanner;

class  Q52a
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
			

		System.out.println("Enter the first string : ");
		String s1 = scanner.nextLine();

		System.out.println("Enter the Second string : ");
		String s2 = scanner.nextLine();

		boolean isRotate = checkRotate(s1, s2);
		
		System.out.println(isRotate ? s2 + " is a rotate of " + s1 : s2 + " is not a rotate of " + s1);
	}

	static boolean checkRotate(String s1, String s2)
	{
		boolean flag = false;
		if (s1.length() != s2.length())
		{
			return flag;
		}

		if ((s1 + s1).indexOf(s2) != -1) //hellohello
		{
			flag = true;
		}

		return flag;
	}
}
