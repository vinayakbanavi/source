class N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(false);
		System.out.println("main end");
	}
	static void test(int i)
	{
		System.out.println("test method : " + i);
	}
}