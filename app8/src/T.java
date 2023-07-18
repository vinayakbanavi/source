class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true);
		if (false)
		System.out.println("if2");
		else
		System.out.println("else2");
		else                                        //ERROR - ELSE WITHOUT IF
		System.out.println("else1 block");
		System.out.println("main end");
	}
}

/*

if (true); is ending at line number 6
else must be only used with if 
there is no pair for else(11)
*/