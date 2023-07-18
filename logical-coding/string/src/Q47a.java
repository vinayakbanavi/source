// Findout first non repeated character
// input  --> hello how are you
// output --> w is first non repeated character

import java.util.Scanner;

class Q47a
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a line of character : ");
		String s1 = scanner.nextLine();
		
		char c1 = s1.charAt(0);
		boolean nonrepeated = false;


		for (int i = 0; i < s1.length() ; i++ )
		{
			c1 = s1.charAt(i);
			if (c1 != ' ' && s1.indexOf(c1, i + 1) == -1 && s1.lastIndexOf(c1, i - 1) == -1)
			{
				nonrepeated = true;
				break;
			}
		} 
		System.out.println(nonrepeated ?"First non repeated character : " + c1 : "all chars repeated in : " + s1);
	}
}
