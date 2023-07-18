class A 
{
	A()
	{
		System.out.println("A()");
	}

	{
		System.out.println("A-IIB");         // instance initialization block
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = new A();
		System.out.println("main end");
	}
}
