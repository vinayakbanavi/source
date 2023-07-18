/*
	Find out two characters Are regardless of case either upper or lower
	dont use toUpperCase() and to LowerCase() 
*/

import java.util.Scanner;

class Q49a
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter first char : ");
		char c1 = scanner.next().charAt(0);
		System.out.println("Please Enter Second char : ");
		char c2 = scanner.next().charAt(0);
		
		int index1 = (c1 >= 'A' && c1 <= 'Z') ? (c1 - 'A') : (c1 - 'a');
		int index2 = (c2 >= 'A' && c2 <= 'Z') ? (c2 - 'A') : (c2 - 'a');
	
		if (index1 == index2)
			System.out.println(c1 + " & " + c2 + " Are same");
		else
			System.out.println(c1 + " & " + c2 + " Are not same");
	}
}
