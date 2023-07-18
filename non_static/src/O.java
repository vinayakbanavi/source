class O 
{
	int i, j;
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("----------");
		test();
		System.out.println("main end");
	}
	static void test()
	{
		O o1 = new O();
		o1.i = 10;
		o1.j = 20;

		O o2 = new O();
		o2.i = 100;
		o2.j = 200;

		System.out.println("from test : " + o1.i + ", " + o1.j);
		System.out.println("from test : " + o2.i + ", " + o2.j);
	}
}
