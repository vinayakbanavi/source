class O
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10);
		System.out.println("main : " + i);
		System.out.println("main end");
	}
	static void test(int i)
	{
		System.out.println("test method : " + i);
		i = 20;
	}
}