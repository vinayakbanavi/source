import java.util.Scanner;

class D6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("main begin");
		System.out.println("please enter something");
		String s1 = sc.next();
		try
		{
			System.out.println("try begin");
			int i = Integer.parseInt(s1); 
			System.out.println(1);
			int j = i / (9 - i);
			System.out.println(2);
			int[] elements = {10, 20};
			int k = elements[j];
			System.out.println(k);
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch " + ex);
		}
		System.out.println("main end");
	}
}
