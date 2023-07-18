/*
 		Method Overloading 
 			There must be a difference in Signature
 			
 			But we can choose static or non static
*/

package pack1;

class A
{
	public static void test()
	{
		System.out.println("from test()");
	}
	
	public void test(int i)
	{
		System.out.println("from test(int)");
	}
}

public class M4 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		
		A.test();
		a1.test(10);
	}
}
