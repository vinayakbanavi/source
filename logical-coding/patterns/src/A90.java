class A90 
{
	public static void main(String[] args) 
	{
		for (char i = 'K';  i <= 'P'; i++ )
		{
			for (char j = i ; j <= i + 5; j++ )
			{
				if (j < 'P')
					System.out.print("  ");
				else
				{
					if ( j == 'P' || j == i + 5 || i == 'P')
					System.out.print(j + " ");
					else
					System.out.print(j -'P' -1 + " ");
			    }
            }
		    System.out.println();
		}
	}
}
