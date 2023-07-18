package pack2;
interface L
{
	void test();
}

class M
{
	public void test()
	{
		System.out.println("M - test");
	}
}

class N extends M implements L
{
	
}

public class M17 
{
	public static void main(String[] args) 
	{
		N n1 = new N();
		n1.test();
		
	}
}
