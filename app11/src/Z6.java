class Z6 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1, j = 20; i <= 3 || j >= -10 ;i++, j -= 5 )
		{
            System.out.println("for loop : " + i + ", " + j);
		}
	}
}
