class P2 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 9 ; i++ )
		{
			for (int j = 1; j <= 10 ;j++ )
			{
				if ( i <= 5 && (j <= i || j + i >= 11))
					System.out.print(0 + " ");
				else if ( i <= 5)
					System.out.print("  ");
				if (i > 5 && ( j + i < 11 || j - i >= 1))
					System.out.print(0 + " ");
				else if ( i > 5)
					System.out.print("  ");
			}
		    System.out.println();
		}
	}
}
