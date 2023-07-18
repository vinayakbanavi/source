 /*
	Balancing bracket in the given string

	(abc)                ---> Balanced
	test [hello] 123     ---> balanced
	(test [hello] 12)3   ---> Balanced
	[test [hell0 12]3    ---> Not Balanced
	(test [hell0 12)3]   ---> Not Balanced
	(test [hell0 12)3    ---> Not Balanced
	(test [hell0 12)3]   ---> Not Balanced
	(test [hell0 (12)3]) ---> Balanced
	([123])              ---> Balanced
	(([123]))            ---> Balanced
	([((123))])          ---> Balanced
	[(((123)))]          ---> Balanced     

	if left paranthesis is equal to right paranthesis than it is balanced
*/

import java.util.Scanner;

class  Q44
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String to check '(' and ')' balanced or not : ");
		String s1 = scanner.nextLine();
		String s2 = "";
		char ch;
		boolean status = false;

		for (int i = 0; i < s1.length() ; i++ )
		{
			ch = s1.charAt(i);

			if (ch == '(' || ch == '[')
			{
				s2 += ch;
			}

			if ( ch == ')' || ch == ']')
			{
				status = s2.length() == 0 ? false : compare(s2.charAt(s2.length() - 1), ch);

				if (status == true)
				{
					s2 = s2.substring(0, s2.length() - 1);
				}
				else
				{
					break;
				}
			}

		}
		
		System.out.println((status && s2.length() == 0) ? "--> is balanced" :"--> is not balanced");
	}

	public static Boolean compare(char ch1, char ch2)
	{
		return ((ch1 == '(' && ch2 == ')' )||( ch1 == '[' && ch2 == ']'));
	}

}