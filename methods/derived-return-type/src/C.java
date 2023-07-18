class C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		StringBuffer b1 = test();
		System.out.println("main end " + b1);
	}
	static StringBuffer test()
	{	
		System.out.println("from test");
		return new StringBuffer("heLLlo");
	}
}

// all class and all interfaces