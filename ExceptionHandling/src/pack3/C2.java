package pack3;

import java.io.*;

class C2
{
	public static void main(String[] args)
	{
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	public static void test1() throws IOException
	{
		System.out.println(3);
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