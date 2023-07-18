package pack4;

import java.util.Scanner;

class E4
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
		catch (RuntimeException ex)
		{
			System.out.println("from catch : " + ex);
		}
		System.out.println("end");
	}
}


// Developing a single catch is not recomennded for multiple type of Exception 
// in single same Solution in catch block for all the applicable Exceptions
// We cant provide Specified solutions for each Exception incase of Single Catch