class Q120a
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5 ; i++ )
		{
			for (int j = 1; j < i ; j++)
			{
				System.out.print("  ");
			}

			for (int j = i; j <= 10 - i; j++)
			{
					System.out.print(i%2 == 0 ? 9 - j + " " : j + " ");
			}
			System.out.println();
		}
	}
}
