class A139 
{
	public static void main(String[] args) 
	{
		for (int i = 5; i >= 1 ; i-- )
		{
			for (int j = 1; j <= 9 ; j++ )
			{
				if (j == i || i + j == 10)
					System.out.print(1 + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}
