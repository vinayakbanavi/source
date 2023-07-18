class A117 
{
	public static void main(String[] args) 
	{
		for (char i = 'p'; i <= 't' ; i++ )
		{
			for (char j = 'p'; j < i ; j++ )
			{
				System.out.print("  ");
			}

			for (char j = i; j < 'p' + 'y' -i ; j++ )
			{
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}
}
