class A96 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 9 ; i++)
		{
			for (int j = 1; j <= 5 ; j++ )
			{
				if (i <= 5 && j <= i )
				{
					if (j == 1 || j == i)
					{
						System.out.print(1);
					}
					else
						System.out.print(0);
				}
				if (i > 5 && j + i < 11)
				{
					if (j == 1 || j + i == 10)
					{
						System.out.print(1);
					}
					else
						System.out.print(0);
				}
			}
		    System.out.println();
		}
	}
}
