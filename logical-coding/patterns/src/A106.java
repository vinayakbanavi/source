class A106 
{
	public static void main(String[] args) 
	{
		for (char i = 'a'; i <= 'k' ; i += 2)
		{
			for (char j = 'a'; j < 'l' - i + 'a' ; j += 2 )
			{
				System.out.print("  ");
			}
			for (char k = 'a'; k <= i ; k++ )
			{
				System.out.print(k + " ");
			}
		    System.out.println();
		}
	}
}
