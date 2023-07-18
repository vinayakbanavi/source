class W
{
	static int i = test1();
	static int j = test2();

	static int test1()
	{
		System.out.println("from test 1 : " + i + ", " + j);
		i += 1;
		j += 2;
		return i + j + 3;
	}
	static int test2()
	{
		System.out.println("from test 2 : " + i + ", " + j);
		i += 4;
		j += 5;
		return i + j + 6;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main : " + i + ", " + j);
		System.out.println("main end");
	}
}
/*
from test 1 : 0, 0
from test 2 : 6, 2
main begin
main : 10,23
main end
*/