class A109
{
	public static void main(String[] args) 
	{
		char k = 'b';
		for (int i = 1; i <= 11 ; i += 2 )
		{
			for (int j = 1; j < 12 - i ; j += 2 )
			{
				System.out.print("  ");
			}
			for (int j = 1; j <= i ; j++ )
			{
				if ( j == 1)
					System.out.print('a' + " ");
                else if ( j == i)
						System.out.print(k++ + " ");
					 else 
						System.out.print(j - 1 + " ");
			}
	    	System.out.println();
		}
	}
}
