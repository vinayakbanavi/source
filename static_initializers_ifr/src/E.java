class E
{
	static
	{
		System.out.println("from sib begin");
		System.exit(0);                           // we can avoid main method execution
		System.out.println("from sib end");
	}

	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}