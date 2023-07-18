class S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 20;
		test(i, i);
		System.out.println("main : " + i);
		System.out.println("main end");
	}
	static void test(int i,int i)
	{
		System.out.println("test method : " + i );
	}
}