class TQ8 
{
	public static void main(String[] args) 
	{
		for (char i = 'A'; i <= 'E' ; i++ )
		{
			for (char j = 'A'; j <= 'G' ; j++ )
			{
				if (j <= 'D')
				{
					System.out.print((char) (i + j - 'A') + " ");
				}
				else 
					System.out.print((char) (i + 'G' - j )+ " ");
			}
	    	System.out.println();
		}
	}
}
