class S 
{
	int i =30;
	static int j = 15;

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
		S s1 = new S();
		System.out.println(s1.i);
		test();

	}
		static void test()
		{
		System.out.println(j);
		}
}