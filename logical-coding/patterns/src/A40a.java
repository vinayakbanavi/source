class A40a 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 7 ; i++)
		{
			for (int j = 1; j <= i ; j++ )
			{
				System.out.print( j != i ? j : 0);
			}
		System.out.println();
		}
	}
}
