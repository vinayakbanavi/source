class A117a 
{
	public static void main(String[] args) 
	{
		for (char i = 'p'; i <= 't' ; i++ )
		{
			for (char j = 'p'; j <= 'x' ; j++ )
			{
				if (j < i || j + i > 'p' + 'x')
					System.out.print("  ");
				else
					System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
