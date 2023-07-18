class  A128 
{
	public static void main(String[] args) 
	{
		for (int i = 1 ; i <= 9 ; i++ )
		{
			char k = 'a';
			for (int j = 1 ; j <= 5 ; j++ )
			{
				if ( j < 6 -i || i - j > 4)
					System.out.print("  ");
				else if ( j == 6 - i || i - j == 4 || j == 5)
						System.out.print(k + " ");
					 else if (i < 6)
							 System.out.print(i + j - 7 + " ");
					 	  else
							 System.out.print(i - j - 3 + " ");
			}
			k++;
			System.out.println();
		}
	}
}
