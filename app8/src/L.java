class L
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			System.out.println("if1 begin");
			if (true)
			{
				System.out.println("if2");
			}
			else
			{
				System.out.println("else2");
			}
			System.out.println("if1 end");
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
if1 begin
if2
if1 end
main end
*/
