class A107 
{
	public static void main(String[] args) 
	{
		for (char i = 'a'; i <= 'k'; i += 2)
		{
			for (char j = 'a'; j < 'l' - i + 'a' ; j += 2 )
			{
				System.out.print("  ");
			}
			for (char k = 'a'; k <= i ; k++ )
			{
				if ( k == 'a' || k == i || i == 'k')
					System.out.print( k + " ");
				else
					System.out.print(0 + " ");
			}
		    System.out.println();
		}
	}
}
