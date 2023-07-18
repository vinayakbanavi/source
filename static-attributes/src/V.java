class V
{
	static int i = test();
	static int j = test();

	static int test()
	{
		System.out.println("from test : " + i + ", " + j);
		return 200;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main : " + i + ", " + j);
		System.out.println("main end");
	}
}
