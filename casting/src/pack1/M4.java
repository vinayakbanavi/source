package pack1;

public class M4 
{
	public static void test(int i)
	{
		System.out.println(i);
	}
	
	public static void main(String[] args) 
	{
		byte b1 = 100;
		short s1 = 100;
		int i = 100;
		long l1 = 1000000000000000000l;
		double d = 10.5;
		
		test(b1);
		test(s1);
		test(i);
//		test(l1);
//		test(d);
	}
}
