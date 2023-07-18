class A132 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 9 ; i++ )
		{
			for (int j = 5 ; j >= 1 ; j--)
			{
				if (i <= 5 && j == i)
					System.out.print(10 - i + " ");
				else
					System.out.print(i > 5 && i + j == 10 ? i + " ": "  ");
			}
			System.out.println();
		}
		
	}
}
