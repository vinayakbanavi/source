class A130 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 9 ; i++ )
		{
			for (int j = 5; j >= 1 ; j-- )
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
