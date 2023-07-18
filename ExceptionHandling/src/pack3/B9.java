package pack3;

import java.io.*;

class B9
{
	public static void main(String[] args)
	{
		System.out.println(1);
//		Propogated Exception Not Handling in test1 flow terminates
		test1();
		System.out.println(2);
	}
	public static void test1()
	{
		System.out.println(3);
//		test2() throws the checked type exception so we cant call method directly
//		compiler will be looking for try catch or throws
		test2();
		System.out.println(4);
	}
	public static void test2() throws IOException
	{
		System.out.println(5);
//		checked : IOException
		new FileWriter("");
		System.out.println(6);
	}
}