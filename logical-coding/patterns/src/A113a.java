class A113a 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 4 ; i++ )
		{
			for (int j = 1; j <= 7; j++ )
			{
				if (j < i || j + i > 8)
					System.out.print("  ");
				else
					System.out.print(j - i + 1 + " ");
			}
			System.out.println();
		}
	}
}
