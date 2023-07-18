class A74a 
{
	public static void main(String[] args) 
	{
		int k = 7;
		for (int i = 1;i <= 7 ; i++)
		{
			for (int j = 1; j <= 7; j++  )
			{
				if (j >= i)
				System.out.print(k);
				else
				System.out.print(" ");

			}
			k--;
		    System.out.println();
		}
	}
}
