class T7a 
{
	public static void main(String[] args) 
	{
		for (char a = 'A'; a <= 'K' ; a += 2)
		{
			for (char j = 'A'; j <= 'L' - a +'A'; j += 2 )
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}
