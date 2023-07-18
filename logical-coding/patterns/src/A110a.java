class A110a 
{
	public static void main(String[] args) 
	{
		char k = 'a';
		for (int i = 1; i <= 11 ; i += 2 )
		{
			for (int j = 1; j < 12 - i; j += 2 )
			{
				System.out.print("  "); 
			}

			for (int j = 1 ; j <= i ; j++ )
			{
				if ( j != 1 && j != i)
					System.out.print(i - j + " ");
				else
					System.out.print(j == 1 ? 'a' + " ":  k + " ");
			}
			k++;
			System.out.println();
		}
	}
}
