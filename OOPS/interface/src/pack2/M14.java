package pack2;

interface A
{
	void test1();
}

interface B
{
	void test2();
}
abstract class C
{
	abstract void test3();
}

//multiple inheritance allowed in the case of interfaces
class D extends C implements A, B
{
	public void test1()
	{
		System.out.println("D - test1");
	}
	public void test2()
	{
		System.out.println("D - test2");
	}
	
	void test3()
	{
		System.out.println("D - test3");
	}
}

public class M14
{
	public static void main(String[] args)
	{
		D d1 = new D();
		d1.test1();
		d1.test2();
		d1.test3();
	}
}
