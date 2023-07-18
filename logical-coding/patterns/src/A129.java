class A129 
{
	public static void main(String[] args) 
	{
		char c = 'a';
		int a = 1;
		for (int i = 1; i <= 9 ; i++ )
		{
			for (int j = 1; j <= 5 ; j++ )
			{
				if (j < 6 - i || i - j > 4)
				{
					System.out.print("  ");
				}
				else if (j == 6 - i || i - j == 4 || j == 5)
				{
					System.out.print(c + " ");
				}
				else
					System.out.print(a++ + " ");
			}
			c++;
			System.out.println();
		}
		
	}
}
