package logicalcoding_strings;

import java.util.Scanner;

public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1 = scanner.nextLine();
		
		String vowels = "aeiou";
		int index;
		char vowel;
		int count;
		String occurance;
		
		for (int i = 0; i < vowels.length(); i++) 
		{
			count = 0;
			occurance = "";
			
			vowel = vowels.charAt(i);
			index = s1.indexOf(vowel);
			
			while (index != -1)
			{
				occurance += index + ", ";
				count ++;
				index = s1.indexOf(vowel, index + 1);
			}
			
			if (count != 0) 
			{
				System.out.println(vowel + " is avaialable " + count + " times at " + "(" + occurance.substring(0, occurance.length() - 2) + ")");
			}
		}
	}
}
