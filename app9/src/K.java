class K
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
			else
			{
				System.out.println("else2 begin");
				if (true)
				{
					System.out.println("if3");
				}
				System.out.println("else2 end");
			}
			System.out.println("else end");
		}
		System.out.println("main end");
	}
}

//else body can have if else

/*
main begin
else begin
else2 begin
if3
else2 end
else end
main end
*/