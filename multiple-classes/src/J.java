class  J
{	
	static
	{
		System.out.println("from J.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Hello.main(null);
		System.out.println("----------");
		Hello.main(args);
		System.out.println("main end");

	}
}
