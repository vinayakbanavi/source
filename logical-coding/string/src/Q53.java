// Convert a String to int type without parseInt method

import java.util.Scanner;

class Q53 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s1 = scanner.nextLine();
		
		if (s1.length() == 0)
		{
			System.out.println("String not entered");
			return;
		}
		char c;
		int num = 0;

		for (int i = 0; i < s1.length() ; i++)
		{
			c = s1.charAt(i);

			if (c >= '0' && c <= '9')
			{
				num = num * 10 + (c - '0');
			}

		}
		System.out.println(num);
	}
}
