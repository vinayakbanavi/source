class Y 
{
	static int i = test();

	public static int test()
	{
		System.out.println("from test : " + i);
		i += 1;
		main(null);                     // calling main method explicitly from the initializer
		return 100;
	}
	public static void main(String[] args) 
	{
		System.out.println("main : " + i);
		i += 2;
	}
}

/*
from test : 0
main : 1
main : 100
*/