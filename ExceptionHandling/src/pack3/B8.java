import java.io.*;

class B8
{
	public static void main(String[] args)
	{
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	public static void test1()
	{
		System.out.println(3);
		test2();
		System.out.println(4);
	}
	public static void test2() 
	{
		System.out.println(5);
//		checked : IOException
		try
		{
			new FileWriter("");
		}
		catch (IOException ex)
		{
			System.out.println("from catch");
		}
		System.out.println(6);
	}
}