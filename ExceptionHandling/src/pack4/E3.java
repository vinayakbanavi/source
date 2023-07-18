package pack4;

import java.util.Scanner;

class E3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter something");
		String s1 = sc.next();

		try
		{
			System.out.println(1);
			int i = Integer.parseInt(s1);
			System.out.println(2);
			int j = i / (i - 9);
			System.out.println(3);
		}
		catch (NumberFormatException ex)
		{
			System.out.println("from catch : " + ex);
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch : " + ex);
		}
	}
}
