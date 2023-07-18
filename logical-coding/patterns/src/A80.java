class A80 
{
	public static void main(String[] args) 
	{
		for (char i = 'P';i >= 'J' ;i-- )
		{
			for (char j = i; j <= i + 6 ; j++)
			{
				System.out.print(j < 'P'? " " : j);
			}
		    System.out.println();
		}
	}
}
