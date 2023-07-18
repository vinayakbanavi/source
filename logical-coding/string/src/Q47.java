// First non repeated character
// input - abc abcd

import java.util.Scanner;

class Q47 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1 = scanner.nextLine();
		char c1 = ' ';
		boolean nonrepeated = false;
		String s2 = "";
		
		for (int i = 0; i <s1.length() ; i++ )
		{
			c1 = s1.charAt(i);
			if (s1.indexOf(c1, i+1) != -1)
			{
				s2 += c1;
			}
		}

		char notrepeated = ' ';

		loop1:
		for (int i = 0; i < s1.length();i++ )
		{
			for (int j = 0; j <s2.length() ; j++ )
			{
				if(s1.charAt(i) == s2.charAt(j))
				{
					continue loop1;
				}
			}
			nonrepeated = true;
			notrepeated = s1.charAt(i);
			break;
		}

		System.out.println(nonrepeated && notrepeated != ' '? "First not repeated : " + notrepeated : "All are repeated in : " + s1);
	}
}

/*
			c1 = s1.charAt(i);
			if (s1.indexOf(c1, i+1) == -1)
			{
				repeated = true;
				break;
			}
*/