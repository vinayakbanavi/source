class A96a 
{
	public static void main(String[] args) 
	{
		for (int i = 1 ; i <= 9 ; i++)
		{
			if (i <= 5)
			{
				for (int j = 1; j <= i ; j++ )
				{
					if (j == 1 || j == i)
						System.out.print(1);
					else 
						System.out.print(0);
				}
			}
			if (i > 5)
			{
				for (int j = 1; j <= 10 - i ; j++ )
				{
					if (j == 1 || j == 10-i)
						System.out.print(1);
					else
						System.out.print(0);
				}
			}
		    System.out.println();
		}
	}
}
