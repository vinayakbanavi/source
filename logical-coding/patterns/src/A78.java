class A78 
{
	public static void main(String[] args) 
	{
		for (int i = 1;i <= 7 ; i++ )
		{
			for (int j = 1;j <= 7 ; j++)
			{
			 if (i == 1 || i == j || j == 7)
				System.out.print(1);
			 else
				System.out.print(j < i ? " " : 0);
			}
		    System.out.println();
		}
	}
}
