class A91a 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 9 ; i++)
		{
			if (i <= 5)
			{
				for (int j = 1 ; j <= i ; j++)
				{
					System.out.print(1);
				}
			}
			else
			{
				for (int j = 1; j + i < 11 ; j++ )
				{
					System.out.print(1);
				}
			}
		System.out.println();
		}
	}
}
