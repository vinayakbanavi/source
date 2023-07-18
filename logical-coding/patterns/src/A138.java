class A138 
{
	public static void main(String[] args) 
	{
		for (char i = 'a'; i <= 'g' ; i++ )
		{
			for (char j = 'a'; j <= 'm' ;  j++)
			{
				if (j == i || i + j == 'm' + 'a')
					System.out.print(i + " ");
				else
					System.out.print("  ");
			}System.out.println();
		}
		
	}
}
