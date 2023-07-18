import java.util.Scanner;

class E3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter something");
			String s1 = sc.next();
			int i = Integer.parseInt(s1); 
			System.out.println(1);
			int j = i / (9 - i);
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch begin");
			int i = 40/0;
			System.out.println("catch end");
		}
		finally
		{
//			Executes everytime, regardless of Exception rising or not
//          Optional , and should be after all the catch blocks
//			Executing some mandatory statements in every Flow
			System.out.println("finally");
		}
		System.out.println("main end");
	}
}
