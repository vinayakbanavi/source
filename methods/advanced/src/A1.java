class  A1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = test(1);
		System.out.println("main : " + i);
		System.out.println("main end");
	}
	static int test (int i)
	{
		System.out.println("test method : " + i);
		return 20;
	}

}
