class A98a 
{
	public static void main(String[] args) 
	{
		for (char i = 'p'; i <= 'z' ; i++ )
		{
			for (char j = 'p'; j <= 'u' ; j++ )
			{
				if ( j == 'p'|| j == i || j + i == 234)
					System.out.print(0);
				else if ( i <= 'u' && j <= i || i > 'u' && j + i < 235)
					System.out.print(j);
			}
		    System.out.println();
		}
	}
}
