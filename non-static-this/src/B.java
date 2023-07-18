class B 
{
	void test()
	{
		System.out.println("test : " + this);
	}

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("main1 : " + b1);
		b1.test();

		B b2 = new B();
		System.out.println("main2 : " + b2);
		b2.test();
	}
}
