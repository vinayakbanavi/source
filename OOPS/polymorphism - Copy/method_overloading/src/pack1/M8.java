package pack1;

public class M8 
{
	final static void test(float f)
	{
		System.out.println("test(float)");
	}
	
	static void test(double d)
	{
		System.out.println("test(double)");
	}
	
	public static void main(String[] args) 
	{
//		by default decimal input to argument will be of double
		test(0.5);
		
//		we must explicitly mention f after value incase of float
		test(1.0f);
		
//		int can be auto widen to float and double
		test(1);
	}
}
