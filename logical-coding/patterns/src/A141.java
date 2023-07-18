class A141 
{
	public static void main(String[] args) 
	{
		for (char i = 'a'; i <= 'i' ; i++ )
		{
			char c = 'p';
			for (char j = 'e'; j >= 'a' ; j-- )
			{
				if ( j > i || i + j > 2 * 'e')
					System.out.print("  ");
				else if (j == i || j == 'a' || i + j == 2 * 'e')
					System.out.print(i + " ");
				else
					System.out.print(c++ + " ");
			}
			System.out.println();
		}
		
	}
}
