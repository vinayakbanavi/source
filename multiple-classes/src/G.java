class Z
{
	static
	{
		System.out.println("from Z.SIB");
	}
	static void test()
	{
		System.out.println("from test");
	}
}

class  G
{
	static
	{
		System.out.println("from G.SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("main bagin");
		Z.test();
		System.out.println("------------");
		Z.test();
		System.out.println("------------");
		System.out.println("main end");
	}
}	
/*
from G.SIB
main begin
from Z.SIB
from test
-------------
from test
-------------
main end
*/