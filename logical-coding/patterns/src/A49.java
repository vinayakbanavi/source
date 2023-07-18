class A49
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 7 ; i++)
		{
			char k = 'P';
			for (int j = 1;j <= i ;j++ )
			{
				if ( j == 1 || j == i)
				System.out.print(k);
			    else
				System.out.print(0);
				k++;
			}
		System.out.println();
		}
	}
}
