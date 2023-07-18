class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Comparable b1 = test();
		System.out.println("main end " + b1);
	}
	static Comparable test()
	{	
		System.out.println("from test");
		return "Anything";
	}
}

