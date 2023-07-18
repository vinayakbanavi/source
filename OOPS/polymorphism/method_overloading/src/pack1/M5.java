/*
 		Constructor Overloading by choosing difference in the Signature
 		And overloaded method can have same return type or different 
 */

package pack1;

public class M5 
{
//	return type as a void
	public static void test(byte i)
	{
		System.out.println("test(byte)");
	}
	
//	return type as a int
	public static int test(long j)
	{
		System.out.println("test(long)");
		return 10;
	}
	public static void main(String[] args) 
	{
		test(126);
	}
}
