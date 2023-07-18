class A93a
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 9 ; i++ )
		{
			for (int j = 1; j <= 5 ; j++)
			{
				if (i <= 5 && j <= i)
					System.out.print(i - j + 1);
				if (i > 5 && j + i < 11)
					System.out.print(11 - (i + j));
			}  
		    System.out.println();
		}
	}
}
