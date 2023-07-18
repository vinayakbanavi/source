class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int b1 = test();
		System.out.println("main end : " + b1);
	}
	static int test()
	{	
		System.out.println("from test");
		int i = 28 + 50;
		return i;
	}
}
