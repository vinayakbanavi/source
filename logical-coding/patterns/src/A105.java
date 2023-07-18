class A105
{
	public static void main(String[] args) 
	{
		for (int i = 9 ; i >= 1 ; i -= 2 )
		{
			for (int j = 1; j < i ; j += 2 )
			{
				System.out.print("  ");
			}
			for (int k = i; k <= 9 ; k++)
			{
				System.out.print(k + " ");
			}
		    System.out.println();
		}
	}
}
