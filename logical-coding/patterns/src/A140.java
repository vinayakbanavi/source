class A140 
{
	public static void main(String[] args) 
	{
		for (char i = 'r'; i <= 'v' ; i++ )
		{
			for (char j = 'v'; j >= 'n'  ; j-- )
			{
				if (j == i)
					System.out.print('r' + " ");
				else if (i + j == 'v' + 'n')
					System.out.print(i + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}
