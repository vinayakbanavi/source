class O
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1; i <= 10 ; i++ ) 
		{
			System.out.println("loopy body begin : " + i);
			if (i == 4)
			{
				continue;           // error unreachable statement ( break and continue should be the last statement of the current block
				i = 8;   
			}
			System.out.println("loopy body end : " + i );
		}
		System.out.println("main end");
	}
}
