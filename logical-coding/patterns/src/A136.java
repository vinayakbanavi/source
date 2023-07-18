class A136 
{
	public static void main(String[] args) 
	{
		for (char i = 'i'; i <= 'u'; i++ )
		{
			for (char j = 'i'; j <= 'o' ; j++)
			{
				if (j == i || i + j == 'i' + 'u')
					System.out.print(i + " ");
				else
					System.out.print("  ");
			}	
			System.out.println();
		}
	
	}
}
