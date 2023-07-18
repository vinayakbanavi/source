class A56a 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 6 ; i++ )
		{
			for (int j = 1; j <= 7 - i; j++ )
			{
				if (i == 1 || i == 6 || j == 1 || j == 7 -i)
					System.out.print(0);
				else
					System.out.print(j -1);
			}
		    System.out.println();
		}
	}
}
