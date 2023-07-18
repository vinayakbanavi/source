class A121 
{
	public static void main(String[] args) 
	{
		for (int i = 1 ; i <= 9 ; i++ )
		{
			for (int j = 1; j <= 5 ; j++ )
			{
				if (j  < 6 -i || i - j > 4)
					System.out.print("  ");
				else
					System.out.print(1 + " ");
			}
			System.out.println();
		}
	}
}
