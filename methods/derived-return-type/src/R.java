class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 20;
		test(i, i);
		System.out.println("main : " + i);
		System.out.println("main end");
	}
	static void test(int i,int j)
	{
		System.out.println("test method : " + i + ", " + j);
		i = 20;
		j = 41;
	}
}