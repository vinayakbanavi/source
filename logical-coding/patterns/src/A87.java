class A87 
{
	public static void main(String[] args) 
	{
		for (char i = 'A';i <= 'F' ;i++ )
		{
			for (char j = 'F'; j >= 'A' ; j-- )
			{
				System.out.print( j > i ? "  " : ((j == i || j == 'A' || i == 'F') ?  j : '0') + " ");
			}
		System.out.println();
		}
	}
}
  