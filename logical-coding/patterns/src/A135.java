class A135 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 13 ; i++ )
		{
			for (int j = 1; j <= 7; j++ )
			{
				if (j == i || i + j == 14)
					System.out.print(1 + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}
