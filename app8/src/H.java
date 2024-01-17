class H
{
	public static void main(String[] args) 
	{
		int i = 20;
		System.out.println("main begin" + i);
		if (i++ == i++)
		{
			System.out.println("if block" + i);
			i += 20;
		}
		else
		{    
			System.out.println("else block" + i);
			i += 30;
		}
        	System.out.println("main end" + i);
	}
}
