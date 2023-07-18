class A71a 
{
	public static void main(String[] args) 
	{
		for (int i = 1 ; i <= 6 ; i++ )
		{
			for (int j = 1 ; j <= 6 ; j++ )
			{
				while (j < i)
				{
	                j++;
					System.out.print(" ");
					continue;
				}
					System.out.print( 1);

			}
		    System.out.println();
		}
	}
}
