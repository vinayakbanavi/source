class A145 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 11 ; i++ )
		{
			for (int j = 1; j <= 11 ; j++ )
			{
				if (j == 7 - i || j - i == 5 || i - j == 5 || i + j == 17)
					System.out.print(1 + " ");
				else if (i == 6)
					System.out.print(j <= 6 ? j + " ": 12 - j + " ");
				else if ( j == 6)
					System.out.print(i <= 6 ? i + " " : 12 - i + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}
