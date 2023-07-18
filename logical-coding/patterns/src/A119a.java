class A119a 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5 ; i++ )
		{
			for (int j = 1; j <= 9 ; j++ )
			{
				if (j < i || j + i > 10)
					System.out.print("  ");
				else if(i %  2 == 0)
					System.out.print(j - i + 1 + " ");
					else
					System.out.print(11 - (i + j) + " ");
			}
			System.out.println();
		}
	}
}
