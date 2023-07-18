class A							
{

}

class D
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
		return new A();
	}
}

// all class and all interfaces
//A@3fee&33d0