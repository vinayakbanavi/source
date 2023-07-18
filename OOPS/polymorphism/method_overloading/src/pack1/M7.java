/*
 		Overloaded Method can be from the same class or different class
 */

package pack1;

class D
{
	void test(long l)
	{
		System.out.println("test(long)");
	}
	
	void test(float f)
	{
		System.out.println("test(float)");
	}
}

class E extends D
{
	void test(double d)
	{
		System.out.println("test(double)");
	}
}

public class M7 
{
	public static void main(String[] args) 
	{
		E obj = new E();
		obj.test(10);	
	}
}
