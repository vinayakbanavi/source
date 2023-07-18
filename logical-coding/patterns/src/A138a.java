class A138a 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 7 ; i++)
		{
			for (int j = 1 ; j <= 13 ; j++)
			{
				if(j == i || j + i == 14)
					System.out.print((char) ('a' + i - 1) + " ");
				 else
					 System.out.print("  ");
			}
			System.out.println();
		}
	}
}
