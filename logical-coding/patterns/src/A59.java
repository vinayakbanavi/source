class A59 
{
	public static void main(String[] args) 
	{
		for (int i = 4; i >= 0; i--)
		{
			for (int j = i; j >= 0 ; j--)
			{
				System.out.print( i == 4 ? 0 : j);
			}
		    System.out.println();
		}
	}
}
