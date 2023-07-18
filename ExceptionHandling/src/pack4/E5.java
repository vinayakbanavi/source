package pack4;

import java.util.Scanner;

class E5
{
	public static void main(String[] args) 
	{
		System.out.println("start");
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
		catch (ArithmeticException | NumberFormatException | NullPointerException ex)
		{
			System.out.println("from catch : " + ex);
		}
		System.out.println("end");
	}
}

// MultiException catch - java 1.8
// We can give any number of Exception as a argument by using bitwise or ( | ) as a seperator