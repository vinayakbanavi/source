class A45 
{
	public static void main(String[] args) 
	{
		for (char i = 'A';i <= 'F' ;i++)
		{
			for (char j = i; j >= 'A' ;  j--)
			{
				if (i == 'C' && j == 'A')
				System.out.print(i);
				else
				System.out.print(j);
			}
		System.out.println();
		}
	}
}
