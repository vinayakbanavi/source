class A89 
{
	public static void main(String[] args) 
	{
		for (int i = 6; i >= 1 ; i--)
		{
			for (int j = 1; j <= 6 ; j++ )
			{
				if (j < i)
				    System.out.print("  ");
				else if ( j == i || j == 6 || i == 1)
					System.out.print('P' + " ");
				else
					System.out.print(j - 3 + " ");
			}
	    	System.out.println();
		}
	}
}
