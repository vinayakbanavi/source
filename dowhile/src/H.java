class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		do
		{
			System.out.println( "do body : " + i);
			if (i == 3)
			{
				break;
                System.out.println(" break should be the last statement of the block");
			}
			i++;
		}
		while (i <= 5);
		System.out.println("main end : " + i);
	}
} 
