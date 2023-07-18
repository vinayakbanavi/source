class A133 
{
	public static void main(String[] args) 
	{
		for (char i = 'a'; i <= 'i' ; i++ )
		{
			for (char j = 'e'; j >= 'a' ; j--)
			{
				if (j == i || i + j == 'e' + 'e')
					System.out.print(i + " ");
			    else
					System.out.print("  ");
			}System.out.println();
		}
	}
}
