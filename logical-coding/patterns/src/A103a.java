class A103a
{
	public static void main(String[] args) 
	{
		for (char i = 'a'; i <= 'k' ; i += 2 )
		{
			for (char j = 'a'; j < 'k' - i + 'a' ; j += 2 )
			{
				System.out.print("  ");
			}
			for (char j = 'a'; j <= i; j++ )
			{
				if ( j == 'a' || j == i || i == 'k')
				System.out.print(1 + " ");
				else
				System.out.print((char)(j - 1) + " ");
			}
		    System.out.println();
		}
	}
}
