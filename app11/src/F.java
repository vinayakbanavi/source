class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 2000; i >= 1 ; i /= 5 )  // i = i/5
		{
			System.out.println("loopy body : " + i);
		}
		System.out.println("main end");
	}
}
