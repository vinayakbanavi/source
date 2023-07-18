class A127 
{
	public static void main(String[] args) 
	{
		for (char i = 'a'; i <= 'i' ; i++ )
		{
			for (char j = 'a'; j <= 'e' ; j++ )
			{
				if ( j < 'e' - i +'a' || i - j > 4)
					System.out.print("  ");
				else if ( j == 'e' - i + 'a' || i - j == 4 || j == 'e')
						System.out.print(i + " ");
					 else
						System.out.print(0 + " ");
			}
			System.out.println();
		}
	}
}
