class A19
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <= 6; i++)
		{
			for (int j = 5; j >= 0; j-- )
			{
				if ( i == 0 || i == 6 || j == 0 || j == 5)
					System.out.print(0 + " ");
				else
                System.out.print((j + i - 1)+ " ");
			}
		System.out.println();
		}
	}
}
