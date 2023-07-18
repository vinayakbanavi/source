class A96b 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 9 ; i++ )
		{
			for (int j = 1 ; j <= 5 ; j++)
			{
				if (j == 1 || j == i || j + i == 10)
				{
					System.out.print(1);
				}
				else
				{
					if ( i <= 5 && j <= i || i > 5 && i + j < 11)
						System.out.print(0);
				}
			}
		    System.out.println();
		}
	}
}
