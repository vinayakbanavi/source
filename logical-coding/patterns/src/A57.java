class A57 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 6 ;i++ )
		{
			for (int j = 6; j >= i ; j--)
			{
				if ( i == 1 || j == 6 || j == i)
				System.out.print(0);
				else
				System.out.print(j -i);
			}
		    System.out.println();
		}
	}
}
