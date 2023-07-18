class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1; i <= 10 ; i++ ) 
		{
			System.out.println("loop body begin : " + i);
			if (i ==7)
			{
				continue;        // in the for loop body if continue executes skips the remaining part and control transfers from the current position into the loop
			}
			System.out.println("loop body end : " + i );
		}
		System.out.println("main end");
	}
}
