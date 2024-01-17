class W
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
			System.out.println("if1");
		if(true)
			System.out.println("if2");
		if(false)
			System.out.println("if3");
		if(true)
			System.out.println("if4");
	}
}
/*
if()
statement 1
if()
statement 2
if()                    ----->sequential or independent if blocks 
statement 3
if()
statement 4
*/
