class TQ7 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5  ; i++ )
		{
			for (int j = 1 ; j <= 7; j++ )
			{
				if (j <= 4)
					System.out.print((j + i - 1) + " ");
				else
					System.out.print((i + 7 - j) + " ");
				
			}
		    System.out.println();
	}
}
}