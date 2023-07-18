class Z 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		for (; i <= 5 ; )
		{
			System.out.println("for loop : "+ i);
			i++;
		}
		System.out.println("main end :" + i);
	}
}