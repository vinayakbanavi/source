class A38 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 8 ; i++ )
		{
			int k = i - 2;
			for (int j = 1;j <= i ; j++)
			{
				if (i == 1 || i == 8 || j == 1 || j == i)
					System.out.print(0);
				else
					System.out.print(k--);
			}
		System.out.println();
		}
	}
}
