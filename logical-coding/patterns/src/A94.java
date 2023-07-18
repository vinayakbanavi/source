class A94
{
	public static void main(String[] args) 
	{
		for (int i = 1;i <= 9 ; i++ )
		{
			for (int j = 1 ; j <= 5 ; j++ )
			{
				if ( i <= 5 && j <= i )
					System.out.print( i );
				if ( i > 5 && j + i < 11)
					System.out.print( i );
			}
	    	System.out.println();
		}
	}
}
