class A49a 
{
	public static void main(String[] args) 
	{
		for (char i = 'P'; i <= 'V' ; i++)
		{
			for (char j = 'P'; j <= i; j++ )
			{
				System.out.print((j == 'P' || j == i) ? j : '0');
			}
		System.out.println();
		}
	}
}
