class A70a 
{
	public static void main(String[] args) 
	{
		for (char i = 'E'; i >= 'A' ; i-- )
		{
			for (char j = 'A' ; j <= i; j++ )
			{
				System.out.print( j + ""+ (j - 64) + " ");
			}
		    System.out.println();
		}
	}
}
