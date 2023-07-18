/*
	Find out two characters Are same regardless of case either upper or lower
	dont use toUpperCase() and to LowerCase() 
*/

import java.util.Scanner;

class Q49 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter first char : ");
		char c1 = scanner.next().charAt(0);
		System.out.println("Please Enter Second char : ");
		char c2 = scanner.next().charAt(0);

		if (c1 < c2)
		{
			if (c1 + 32 == c2 || c1 == c2 )
				System.out.println("Both characters " + c1 + " and " + c2 + " are same");
			else
				System.out.println("Both characters " + c1 + " and " + c2 + " are not same");
		}

		else
		{
			if (c1 - 32 == c2 || c1 == c2)
				System.out.println("Both characters " + c1 + " and " + c2 + " are same");
			else
				System.out.println("Both characters " + c1 + " and " + c2 + " are not same");
		}
	}
}
