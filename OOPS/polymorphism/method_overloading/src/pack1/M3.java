/*
 		Method Overloading 
 			There must be a difference in Signature
 			
 			But we can choose same or different access specifier for overloaded method
*/

package pack1;

public class M3 
{	
	private static void test(int i)
	{
		System.out.println("from test(int)");      
	}
	
	public static void test(long i)
	{
		System.out.println("from test(long)");
	}
	
	static void test(Integer i)
	{
		System.out.println("from test(Integer)");
	}
	
	protected static void test(Number i)
	{
		System.out.println("from test(Number)");
	}
	
	public static void test(Object i)
	{
		System.out.println("from test(Onject)");
	}
	
	public static void main(String[] args) 
	{
		int i = 10;
		int j = new Integer(10);
		int k = Integer.valueOf(10);
	
		
		test(i);
		test(j);
		test(k);
		test(10);
				
	}
}
