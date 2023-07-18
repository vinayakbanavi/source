class B
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
			System.out.println("if block");
		}
		else
		{
			System.out.println("else begin");
			if (false)
			{
				System.out.println("if2");
			}
			System.out.println("else end");
		}
		System.out.println("main end");
	}
}

//else body can have if else96