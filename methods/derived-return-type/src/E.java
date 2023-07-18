interface A							
{
}

class E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = test();
		System.out.println("main end " + a1);
	}
	static A test()
	{	
		System.out.println("from test");
		return null;
	}
}

