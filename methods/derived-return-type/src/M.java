class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(20);
		System.out.println("main end");
	}
	static void test(int i)
	{
		System.out.println("test method : " + i);
	}
}