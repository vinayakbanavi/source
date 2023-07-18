package pack1;

class A
{
	void test()
	{
		System.out.println("A - test");
	}
}

class B extends A
{
	void test(int i)
	{
		System.out.println("B - test");
	}
}


public class M1 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		b1.test(10);
	}
}
// inherited method can be overloaded.