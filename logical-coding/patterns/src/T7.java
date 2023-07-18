class T7
{
	public static void main(String[] args) 
	{
		for (char i = 'K'; i >= 'A'; i -= 2)
		{
			for (char j = 'A'; j <= i; j += 2 )
			{
				System.out.print(j + " ");
			}
		System.out.println();
		}
	}
}
