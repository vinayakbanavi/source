package pack2;

interface H
{
	void test1();
}

interface I
{
	void test2();
}

interface J extends H, I
{
	void test3();
}

class K implements J
{
	public void test1()
	{
		System.out.println("K - test1");
	}
	public void test2()
	{
		System.out.println("K - test2");
	}
	public void test3()
	{
		System.out.println("K - test3");
	}
}

public class M16 
{
	public static void main(String[] args)
	{
		K k1 = new K();
		k1.test1();
		k1.test2();
		k1.test3();
	}
}

//	interface can extends multiple interfaces at same time