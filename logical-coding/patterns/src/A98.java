class A98 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 11 ; i++ )
		{
			char k = 'q';
			for (int j = 1; j <= 6 ; j++ )
			{
				if (j== 1 || j == i || j + i == 12)
					System.out.print(0);
				else if ( i <= 6 && j <= i || i > 6 && j <= 12 - i)
					System.out.print(k++);
			}
		    System.out.println();
		}
	}
}
