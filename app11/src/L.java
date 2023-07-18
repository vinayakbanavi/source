class L
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1; i <= 10 ; i++ ) 
		{
			System.out.println("loopy body begin : " + i);
			if (i <= 5)
			{
				continue;        // in the for loop body if continue executes skips the remaining part and control transfers from the current position into the loop
			}
			System.out.println("loopy body end : " + i );
		}
		System.out.println("main end");
	}
}
