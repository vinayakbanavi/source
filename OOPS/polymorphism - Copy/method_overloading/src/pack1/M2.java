package pack1;

public class M2 
{
	public static void test(byte i)
	{
		System.out.println("test(byte)");
	}
	
	public static void test(short i)
	{
		System.out.println("test(short)");
	}
	
	public static void test(int i)
	{
		System.out.println("test(int)");
	}
	
	public static void test(long i)
	{
		System.out.println("test(long)");
	}
	public static void main(String[] args) 
	{
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		
//		by default test(Corresponding data type) will be called
		test(b);
		test(s);
		test(i);
		test(l);
		
		System.out.println("\ndefault input type of number will be int");
//		defult input type will be of int
		test(100);
		
//		we can explicitly add L to convert int to long
		test(100l);
		
	}
}
