class M 
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println("main1 : " + a);
		int a = 9;                           // local variable getting more preference when local and global availabe with same variable name.
		System.out.println("main2 : " + a);
	}
}
