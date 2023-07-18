class A134
{
	public static void main(String[] args) 
	{
		for (char i = 'p'; i <= 'x' ; i++ )
		{
			for (char j = 't'; j >= 'p' ; j--)
			{
				if (j == i || i + j == 't' + 't')
					System.out.print(i + " ");
			    else
					System.out.print("  ");
			}System.out.println();
		}
	}
}