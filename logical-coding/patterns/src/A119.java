class A119 
{
	public static void main(String[] args) 
	{
		for (int i = 9; i >= 1 ; i -= 2 )
		{
			for (int j = 9; j > i ; j -= 2 )
			{
				System.out.print("  ");
			}

			for (int j = 1; j <= i ; j++ )
			{
				if (i == 9 || i == 5 )
				System.out.print(10 - j + " ");
				else
				System.out.print(j + " ");
			}
		    System.out.println();
		}
	}
}
