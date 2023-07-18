class M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1; i <= 10 ; i++ ) 
		{
			System.out.println("loopy body begin : " + i);
			if (i == 4)
			{
				break;        // if break executes skips the remaining portion and exits the loop
			}
			System.out.println("loopy body end : " + i );
		}
		System.out.println("main end");
	}
}
