class  A112
{
	public static void main(String[] args) 
	{
		for (int i = 7; i >= 1 ; i -= 2)
		{
			for (int j = 1; j < 8 - i ; j += 2 )
			{
				System.out.print("  ");
			}

			for (int j = 1; j <= i ; j++ )
			{
				System.out.print( ((i - 1)% 3) + 1 + " ");
			}
			System.out.println();
		}
	}
}
