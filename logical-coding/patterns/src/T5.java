class T5 
{
	public static void main(String[] args) 
	{
		for (int i = 8; i >= 1 ; i-- )
		{
			for (int j = 1; j <= i ; j++)
			{
				if ( i == 8 || i == 1 || j == 1 || j == i)
				System.out.print(0 + " ");
				else
				System.out.print(j - 1 + " ");
			}
		System.out.println();
		}
	}
}
