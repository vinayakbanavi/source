class M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			if (true)
			{
				System.out.println("if2");
			}
			else
			{
				System.out.println("else2");
			}
		}
		else
		{    
			System.out.println("else1 block");
		}
		System.out.println("main end");
	}
}

/*
main begin
if2
main end
*/
