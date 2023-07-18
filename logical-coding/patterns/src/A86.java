class A86 
{
	public static void main(String[] args) 
	{
		for (char i = 'A'; i <= 'F';i++ )
		{
			for (char j = 'F'; j >= 'A' ;j-- )
			{
				if (j > i)
				System.out.print("  ");
				else
				{
			       if ((i == 'E' || i == 'F') && j == 'C')
				   System.out.print('D' + " ");
				   else
					{
					   if (( i == 'E' || i == 'F') && j == 'D')
					   System.out.print( 'C' + " ");
					   else
					   System.out.print(j + " " );
				    }
				}
			}
		       System.out.println();
	    }
    }
}