class TQ6 
{
	public static void main(String[] args) 
	{
		for (int i = 9; i >= 1 ; i -- )
		{
			for (int j = 10; j >= 1 ; j-- )
			{
				if (j > i)
				{
					System.out.print(0 + " ");
				}
				else
					System.out.print(j + " ");
			}
		    System.out.println();
		}
	}
}
