class Y 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		for (; false; i++)
		{
			System.out.println( " for loop : " + i);
		}
		System.out.println(" main end : " + i);
	}
}

// error: unreachable statement {