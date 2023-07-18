class A 
{
	void test()
	{
		System.out.println("test : " + this);
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("main : " + a1);
		a1.test();
	}
}

// this ==> reference variable