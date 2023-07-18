class A105 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 9; i+= 2)
		{
			for (int j = 1; j < 10 - i ; j += 2 )
			{
				System.out.print("  ");
			}
			for (int k = 1 ; k <= i ; k++ )
			{
				System.out.print(k + " ");
			}
	    	System.out.println();
		}
	}
}
