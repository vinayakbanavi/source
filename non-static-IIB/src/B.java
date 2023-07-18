class B
{
	B()
	{
		System.out.println("B()");
	}

	{
		System.out.println("B-IIB");         // instance initialization block will execute each time whenever object is creating
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B b1 = new B();
		System.out.println("-----------");
		B b2 = new B();
		System.out.println("-----------");
		System.out.println("main end");
	}
}
