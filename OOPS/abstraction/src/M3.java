package pack2;

abstract class B
{
	void test1()                                //concrete method
	{
		System.out.println("from test1");
	}
	abstract void test2();                      //abstract method
}

class C extends B
{
// Overriding abstract method and implementing
	void test2()
	{
		System.out.println("from test2");
	}
}

public class M3
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.test1();
		c1.test2();
	}

}
