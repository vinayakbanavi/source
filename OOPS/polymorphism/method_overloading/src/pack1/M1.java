/*
		Method Overloading : achieving the same behavior for different parameters
		Creating the method with same name by choosing the difference in signature
		Signature : Choosing difference in data type of argument
					Difference in number of argument
					Difference in order of data type of any argument
		
		Conditions :   
			Identifier - same
			Signature - different
			
			Access Specifier : Can be same or different
			Modifier : can be static or non static
			Return type : can be same or different
			abstract or concrete
			final or normal
			can be from the same class or different(in inheritance)
 */

package pack1;

public class M1 
{
	public static void test()
	{
		System.out.println("from test()");
	}
	
	public static void test(int i)
	{
		System.out.println("from test(int)");
	}
	
	public static void test(int i, int j)
	{
		System.out.println("from test(int, int)");
	}
	
//	varArgs is of last priority 
//	executes only if no other suitable override available
	public static void test(int ... i)
	{
		System.out.println("from test(var args)");
	}
	
	public static void main(String[] args) 
	{
//		specified method will execute for given argument
		test();
		test(12);
		test(1,2);
		test(1,2,3);
	}
}
