class A70 
{
	public static void main(String[] args) 
	{
		for (char i = 'E';i >= 'A' ; i--)
		{
			int k =1;
			for (char j = 'A'; j <= i ; j++)
			{
				System.out.print(j+""+k++);
			}
		    System.out.println();
		}
	}
}
