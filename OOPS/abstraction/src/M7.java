package pack2;

abstract class J
{
	void test1()
	{
		System.out.println(" J-test1");
	}
}

class K extends J
{
	
}

public class M7 
{
	public static void main(String[] args) 
	{
		K k1 = new K();
		k1.test1();
	}
}
