class A41 
{
	public static void main(String[] args) 
	{
		for (int i = 7; i >= 1 ;i-- )
		{
			int k = i;
			for (int j = 7; j >= i; j-- )
			{
			  System.out.print( i == j? 0 :k++ );
			}
		System.out.println();
		}
	}
}
