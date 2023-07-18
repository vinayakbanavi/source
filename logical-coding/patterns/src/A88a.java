class A88a
{
	public static void main(String[] args) 
	{
		for (char i = 'A'; i <= 'F'; i++ )
		{
			for (char j = 'F'; j >= 'A' ; j-- )
			{
				if (j > i )
					System.out.print("  ");
				else
				{
					if (j == i || j == 'A' || i == 'F')
					System.out.print(j + " ");
					else
					System.out.print(i - j - 1 + " ");
				}
			}
		System.out.println();
		}
	}
}
//System.out.print(j > i ? "  " : ((j == i || j == 'A' || i == 'F') ?  j : (i - j - 1)) + " "); 
//both true value and false value should be of same data type in case of ternary
