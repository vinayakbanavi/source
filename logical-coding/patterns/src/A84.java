class A84 
{
	public static void main(String[] args) 
	{
		for (int i = 7;i >= 1 ;i-- )
		{
			for (int j = 1; j <= 7 ; j++ )
			{
				System.out.print(j < i ? " " + " ": ((j == i || j == 7 || i == 1) ? j + " " : 0 + " "));
			}
		System.out.println();
		}
	}
}
