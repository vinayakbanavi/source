class A118 
{
	public static void main(String[] args) 
	{
		for (char i = 'p'; i <= 't' ; i++ )
		{
			for (char j = 'p'; j < i ; j++ )
			{
				System.out.print("  ");
			}

			for (char j = i; j < 'p' + 'y' - i ; j++ )
			{
				if ( j == i || j == ('p' + 'x' - i))
					System.out.print(j + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}
	}
}
