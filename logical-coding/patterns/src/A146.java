class A146 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 13 ; i++ )
		{
			for (int j = 1; j <= 13 ; j++ )
			{
				if (j == 8 - i || j - i == 6 || i - j == 6 || i + j == 20 || (j - i == 2 || i - j == 2) && j >= 8 - i && i + j <= 20 )
					System.out.print(1 + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}
