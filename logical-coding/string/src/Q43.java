/*
	Balancing bracket in the given string

	(abc)               ---> Balanced
	test (hello) 123    ---> balanced
	(test (hello) 12)3  ---> Balanced
	(test hell)0 12)3   ---> Not Balanced
	(test 123           ---> Not Balanced
	(test 123           ---> balanced
	(((te)st 123))      ---> balanced
	(((test 123)))      ---> balanced
	(((t)e)st 123)      ---> balanced

	if left paranthesis is equal to right paranthesis than it is balanced
*/

import java.util.Scanner;

class  Q43
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String to check '(' and ')' balanced or not : ");
		String s1 = scanner.next();
		int leftcount = 0;
		int rightcount = 0;
		for (int i = 0; i < s1.length() ; i++ )
		{
			if (s1.charAt(i) == '(')
			{
				leftcount++;
			}
			if (s1.charAt(i) == ')')
			{
				rightcount++;
			}
		}


		if (leftcount == rightcount)
		System.out.println(s1 + " --> is Balanced");
		else
		System.out.println(s1 + " --> is not Balanced");
	}
}
