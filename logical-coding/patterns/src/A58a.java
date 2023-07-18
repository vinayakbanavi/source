class A58a 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5; i++ )
		{
			for (int j = 1; j <= 6 - i ; j++ )
			{
				if (i == 1 || j == 6 - i)
					System.out.print(0);
				else
					System.out.print(j);
			}
		    System.out.println();
		}
	}
}
