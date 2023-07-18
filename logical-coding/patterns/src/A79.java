class A79 
{
	public static void main(String[] args) 
	{
		for (char i = 'a';i <= 'h' ; i++ )
		{
			for (char j = 'a';j <= 'h' ; j++ )
			{
				System.out.print(j < i ? " " : i);
			}
		    System.out.println();
		}
	}
}
