//Findout first repeated character
// input  --> hello how are you
// output --> w is first repeated character

import java.util.Scanner;

class Q46b
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a line of character : ");
		String s1 = scanner.nextLine();
		
		char c1 = s1.charAt(0);
		boolean repeated = false;


		for (int i = 0; i < s1.length() - 1; i++ )
		{
			c1 = s1.charAt(i);
			if (s1.indexOf(c1, i + 1) != -1)
			{
				repeated = true;
				break;
			}
		} 
		System.out.println(repeated ?"First repeated character : " + c1 : "No chars repeated in : " + s1);
	}
}
