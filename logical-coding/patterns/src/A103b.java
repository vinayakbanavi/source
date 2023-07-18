class A103b
{
	public static void main(String[] args) 
	{
		for (char i = 'a'; i <= 'f' ; i++ )
		{
			for (char j = 'a'; j <= 'k' ; j++ )
			{
				if ( j < 'f' - i + 'a' || j - i > 5 )
					System.out.print("  ");
				else if ( j == 'f' - i + 'a' || j - i == 5|| i == 'f')
						System.out.print(1 + " ");
					else
						System.out.print((char)(j + i - 'g')+ " ");
			} 
	    	System.out.println();
		}
	}
}
