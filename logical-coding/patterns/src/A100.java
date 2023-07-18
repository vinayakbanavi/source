class A100 
{
	public static void main(String[] args) 
	{
		for (char i = 'p'; i <= 'z' ; i++)
		{
			for (char j = 'p'; j <= 'u'; j++ )
			{
				if ( j == 'p')
					System.out.print(j + " ");
				else if (j == i || j + i == 'v' + 't')
					System.out.print(i + " ");
				else if (i <= 'u' && j <= i || i > 'u' && j + i <= 'v' + 't')
					System.out.print(0 + " ");
			}
		    System.out.println();
		
		}	int z ='p';
			 
	}
}
