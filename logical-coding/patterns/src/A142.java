class A142
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 11; i++ )
		{
			for (int j = 1; j <= 11 ; j++ )
			{
				if (j < 7 - i || j - i > 5 || i - j > 5 || i + j > 17)
					System.out.print("  ");
				else
					System.out.print(1 + " ");
			}
			System.out.println();
		}	
	}
}
