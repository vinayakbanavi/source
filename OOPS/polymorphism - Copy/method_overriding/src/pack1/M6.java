package pack1;

class K
{
	void test()
	{
		System.out.println("k - test");
	}
}

class L extends K
{
	void test()
	{
		System.out.println("L - test begin");
//		explicitly calling super class method
		super.test();
		System.out.println("L - test end");
	}
}

public class M6 
{
	public static void main(String[] args) 
	{
		L l1 = new L();
		l1.test();
	}
}
