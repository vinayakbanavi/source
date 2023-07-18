class A86a 
{
	public static void main(String[] args) 
	{
		for (char i = 'A';i <= 'F' ; i++)
		{
			for (char j = 'F'; j >= 'A' ; j-- )
			{
				System.out.print(j > i ? "  " : j + " ");
			}
		System.out.println();
		}
	}
}
