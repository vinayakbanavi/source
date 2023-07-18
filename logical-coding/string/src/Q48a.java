//Find out given two strings are anagrams or not

/*
		Anagrams --> are the words madeup of same characters of another word
		abc    --> bca, cba
		hello  --> hlloe, oelhl, lohel
		alter  --> alert, later
*/
import java.util.Scanner;

class Q48a
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String : ");
		String s1 = scanner.next();
		System.out.println("Enter the second String : ");
		String s2 = scanner.next();

		String temp = s2;
		char c1;
		boolean anagram = true;
		int index;

		for (int i = 0; i < s1.length() ; i++ )
		{
			c1 = s1.charAt(i);
			index = temp.indexOf(c1);
			
			if (index == -1)
			{
				anagram = false;
				break;
			}
			//helo
			temp = temp.substring(0, index) + temp.substring(index + 1);
		}
		if (temp.length() != 0)
		{
			anagram = false;
		}
		System.out.println(anagram ? s2 + " is anagram of " + s1 :  s2 + " is not anagram of " + s1);
	}
}

/*
	s1   --> alert
	temp --> later

	{
	c1    --> a
	index --> 1
	
	if(1 == -1) false
	{

	}
	
	temp= temp.substring(0, index) + temp.substring(index + 1, temp.length())
			l + ter
			lter
	}

	{
	c1    --> l
	index --> 0
	
	if(0 == -1) false
	{

	}
	
	temp= temp.substring(0, index) + temp.substring(index + 1, temp.length())
			"" + ter
			ter
	}
	{
	c1    --> e
	index --> 1
	
	if(0 == -1) false
	{

	}
	
	temp= temp.substring(0, index) + temp.substring(index + 1, temp.length())
			t + r
			tr
	}
	{
	c1    --> r
	index --> 1
	
	if(0 == -1) false
	{

	}
	
	temp= temp.substring(0, index) + temp.substring(index + 1, temp.length())
			t 
	}
	{
	c1    --> t
	index --> 0
	
	if(0 == -1) false
	{

	}
	
	temp= temp.substring(0, index) + temp.substring(index + 1, temp.length())
			"" 
	}


	if(temp.length() != 0) false
	{
	}


*/