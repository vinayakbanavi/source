class A74 
{
	public static void main(String[] args) 
	{
		for (int i = 7;i >= 1;i-- )
		{
			for (int j = 7;j >= 1 ; j-- )
			{
				if (j <= i)
				System.out.print(i);
				else
				System.out.print(" ");
			}
	     	System.out.println();
		}
	}
}
