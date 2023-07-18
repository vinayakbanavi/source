class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1; i <= 10 ; i++ )  
		{
			System.out.println(" outer loop body begin : " + i);
			for (int j =500 ; j<=503 ; j++ )
			{
				System.out.println(" inner loop begin : " + i + " , " + j );
				if (j == 501)
				{
					break;
				}
				System.out.println(" inner loop end : " + i + " , " + j );
			}
			System.out.println("outer loopy body end : " + i );
		}
		System.out.println("main end");
	}
}

