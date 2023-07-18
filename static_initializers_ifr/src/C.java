class C
{
	static int i = test();

	static
	{
		System.out.println("C - SIB1");
	}

	public static void main(String[] args) 
	{
		System.out.println("main : " + i + ", " + j);
	}

	static int j = test();
	
	static
	{
		System.out.println("C - SIB2");
	}

	static int test()
	{
		System.out.println("from test");
		return 10;
	}

}

/*
from test
C - SIB1
from test 
C - SIB2
main : 10, 10

*/
