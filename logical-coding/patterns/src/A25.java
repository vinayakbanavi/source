class A25 
{
	public static void main(String[] args) 
	{
		for (char i = 'F'; i <= 'J' ; i++)
		{
			for (char j = i; j >= i - 5; j-- )
			{
				System.out.print(j + " ");
			}
		System.out.println();
		}
	}
}
