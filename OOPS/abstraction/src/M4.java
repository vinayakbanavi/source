package pack2;

abstract class D
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
}

class E extends D
{
	void test1()
	{
		System.out.println("from E.test1");
	}
	void test2()
	{
		System.out.println("from E.test2");
	}
	void test3()
	{
		System.out.println("from E.test3");
	}
}

public class M4 
{
	public static void main(String[] args)
	{
		E e1 = new E();
		e1.test1();
		e1.test2();
		e1.test3();
		
	}
}
