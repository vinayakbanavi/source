class A101 
{
	public static void main(String[] args) 
	{
		for (int i = 1 ; i <= 5 ; i++ )
		{
			for (int j = 1 ; j <= 11 ; j++ )
			{
				if ( j <= 6 && j < 7 - i || j > 6 && j - i > 5)
					System.out.print("  ");
				else
					System.out.print(1 + " ");
			}
		    System.out.println();
		}
	}
}
