class A81 
{
	public static void main(String[] args) 
	{
		for (int i = 1;i <= 8;i++)
		{
			for (int j = 1; j <= 8 ; j++)
			{
				System.out.print((i + j) < 9 ? " ":(i + j - 8));
			}
		System.out.println();
		}
	}
}
