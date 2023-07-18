//Find out given two strings are anagrams or not

/*
		Anagrams --> are the words madeup of same characters of another word
		abc    --> bca, cba
		hello  --> hlloe, oelhl, lohel
		alter  --> alert, later
*/
import java.util.Scanner;

class Q48 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String : ");
		String s1 = scanner.next();
		System.out.println("Enter the second String : ");
		String s2 = scanner.next();

		char ch;
		boolean anagram = s1.length() == s2.length() ? true : false  ;
		
		loop1:
		for (int i = 0; i <s1.length() ; i++ )
		{
			ch = s1.charAt(i);

			for (int j= 0; j <s2.length() ; j++ )
			{
				if (ch == s2.charAt(j))
				{
					continue loop1;
				}
			}

				
			anagram = false;
			break loop1;
		}

		if (anagram == true)
		{
			loop2:
			for (int i = 0; i <s2.length() ; i++ )
			{
				ch = s2.charAt(i);

				for (int j= 0; j <s1.length() ; j++ )
				{
					if (ch == s1.charAt(j))
					{
						continue loop2;
					}
				}

				anagram = false;
				break loop2;
			}
		}

		System.out.println(anagram ? s2 + " is anagram of " + s1 :  s2 + " is not anagram of " + s1);
	}
}
