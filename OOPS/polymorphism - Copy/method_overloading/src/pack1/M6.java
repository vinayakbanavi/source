package pack1;

abstract class B
{
	abstract void test(String s);
	void test(Object s)
	{
		System.out.println("test(Object)");
	}
}

class C extends B
{
	void test(String s)
	{
		System.out.println("test(String)");
	}
}

public class M6 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.test("hello");
	}
}
