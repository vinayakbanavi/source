class  A102a
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 13; i += 2 )
		{
			for (int j = 1; j <= 12 - i ; j += 2 )
			{
				System.out.print("  ");
			}
			for (int j = 1; j <= i ;j++ )
			{
				if (j == 1 || j == i || i == 13)
					System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
		    System.out.println();
		}
	}
}
