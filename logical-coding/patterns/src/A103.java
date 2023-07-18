class A103 
{
	public static void main(String[] args) 
	{
		for (int i = 1 ; i <= 6 ; i++ )
		{
			char k = 'a';
			for (int j = 1; j <= 11 ; j++ )
			{
				if ( j < 7 - i || j - i > 5)
					System.out.print( "  ");
				else
					if (j == 7-i || j - i == 5 || i == 6)
					System.out.print(0 + " ");
				    else
					System.out.print(k++ + " ");
			}
		    System.out.println();
		}
	}
}
