class A76 
{
	public static void main(String[] args) 
	{
		for (int i = 7; i <= 13 ; i++ )
		{
			for (int j = i; j >= i - 6; j-- )
			{
				System.out.print(j > 7 ? " " : j);
			}
		System.out.println();
		}
	}
}
