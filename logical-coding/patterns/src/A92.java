class A92 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 9 ; i++ )
		{
			for (int j = 1 ; j <= 5 ; j++)
			{
				if (i <= 5 && j <= i)
					System.out.print(j);
				if (i >5 && i + j < 11)
					System.out.print(j);
			}
	    	System.out.println();
		}
	}
}
