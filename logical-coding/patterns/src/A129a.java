class A129a 
{
	public static void main(String[] args) 
	{
		int a = 1;
		for (char i = 'a'; i <= 'i' ; i++ )
		{
			for (char j = 'e'; j >= 'a'; j-- )
			{
				if (j > i || i + j > 'e' + 'e')
					System.out.print("  ");
				else if (j == i || i + j == 'e' + 'e' || j == 'a')
						System.out.print(i + " ");
					 else
						System.out.print(a++ + " ");
			}
			System.out.println();
		}
		
	}
}
