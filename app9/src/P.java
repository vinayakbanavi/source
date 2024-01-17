class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
			System.out.println("if block");
		else if (true)
			System.out.println("if2");
		else if (true)
			System.out.println("if3");
		System.out.println("main end");
	}
}

//else body can have if else

/*
main begin
if2
main end
*/
