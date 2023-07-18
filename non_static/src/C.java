class C 
{
	int i;

	void test()
	{
		System.out.println("from test");
	}

	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println(c1.i);
		c1.i = 200;
		System.out.println(c1.i);
		c1.i = 400;
		System.out.println(c1.i);
		c1.test();
	}
}
//WITHOUT REFERENCE VARIABLE WE CANT USE ANY NON STATIC MEMBER