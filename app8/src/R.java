 lass R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
			if (true)
				System.out.println("if2");
			else
				System.out.println("else2");
		else
			System.out.println("else1 block");
		System.out.println("main end");
	}
}

/*
main begin
else1 block
main end
*/
