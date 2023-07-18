class A93 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 9 ; i++ )
		{
			if (i <= 5)
			{
				for (int j = i; j >= 1; j-- )
				{
					System.out.print(j);
				}
			}
			else
			{
				for (int j = 10 - i ; j >= 1 ; j--)
				{
					System.out.print(j);
				}
			}
		    System.out.println();
		}
	}
}
