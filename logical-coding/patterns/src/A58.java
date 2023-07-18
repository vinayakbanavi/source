class A58 
{
	public static void main(String[] args) 
	{
		for (int i = 5; i >= 1 ; i--)
		{
			for (int j = 1; j <= i ; j++)
			{
				if ( i == 5 || j == i)
				System.out.print(0);
				else 
				System.out.print(j);
			}
		    System.out.println();
		}
	}
}
