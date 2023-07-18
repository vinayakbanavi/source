class TQ5 
{
	public static void main(String[] args) 
	{
		for (int i = 9; i >= 5; i--)
		{
			for (int j = i; j >= i - 7 ; j-- )
			{
				if (j > 5)
				{
					System.out.print(j + " ");
				}
				else
					System.out.print(0 + " ");
			}
		    System.out.println();
		}
	}
}
