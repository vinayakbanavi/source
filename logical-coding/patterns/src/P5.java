class  P5
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <= 5 ; i++ )
		{
			for (int j = 11; j + i >= 11 ; j--)
			{
				if (i == 0 || i == 3)
				{
					System.out.print( '#' + " ");
				}
				else 
					System.out.print(j - i + " ");
			}
		    System.out.println();
		}
	}
}

/*

#
10 9
9 8 7
# # # #
7 6 5 4 3
6 5 4 3 2 1

*/0