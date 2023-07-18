//String Replace
import java.util.Arrays;

class A1 
{
	public static void main(String[] args) 
	{
		String s1 = "123abcABC";

	/*
		String s2 = s1.replace('a','z');
		System.out.println(s2);
		output - 123zbcABC
	*/
	/*
		String s2 = s1.replaceAll("[^1-9]","");
		System.out.println(s2);
		output - 123
	*/

	/*
		String s2 = s1.replaceAll("[^A-Z]","");
		System.out.println(s2);
		output - ABC
	*/
	
	/*
		String s2 = s1.replaceAll("[^a-z]","");
		System.out.println(s2);
		output - abc
	*/

	/*
	    String s2 = s1.substring(3);
		System.out.println(s2);
		output - abcABC
	    if substring having only one argument, the argument will be the starting index of the string

	*/
	
	/*
		String s2 = s1.substring(3,6);
		System.out.println(s2);
		output - abc
	    if substring having two argument
		1st - starting index of the string
		2nd - arg - 1 of the string

	*/

	/*
		String s1 = "123abcABC!@#";
		String[] s2 = s1.split("[a-zA-Z0-9]");
		String symbols = String.join("",s2);
		System.out.println(symbols);
	*/

	}
}
