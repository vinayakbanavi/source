class A300
{
	public static void main(String[] args) 
	{
		for (int i = 1;i <= 7; i++ )
		{
			for (int j = 1; j <= 7 ; j++)
			{
				if (j < i)
				{
					for (int k = j;k < i ; k++ )
					{
						System.out.print(" ");
					}
				}
				else
				System.out.print(j);
				}
		System.out.println();
		}
	}
}
