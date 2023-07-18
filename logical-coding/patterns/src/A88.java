class A88 
{
	public static void main(String[] args) 
	{
		for (char i = 'A'; i <= 'F'; i++ )
		{
			char k = '0';
			for (char j = 'F'; j >= 'A' ; j-- )
			{
				System.out.print(j > i ? "  " : ((j == i || j == 'A' || i == 'F') ? j : k++ ) + " ");
			}
		System.out.println();
		}
	}
}
 