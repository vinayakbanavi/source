class  A99 
{
	public static void main(String[] args) 
	{
		for ( char i = 'a'; i <= 'k'; i++)
		{
			for (char j='a'; j <= 'f'; j++ )
			{
				if ( i <= 'f' && j <= i || i > 'f' && j + i < 'g' + 'f')
					System.out.print( j);
			}
		    System.out.println();
		}
	}
}
