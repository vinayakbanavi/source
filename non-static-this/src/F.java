class F 
{
	int i;
	
	void test1()
	{
		System.out.println("test1 : " + i);
		i += 5;
		test2();
	}

	void test2()
	{
		System.out.println("test2 : " + i);
		i += 10;
	}

	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.i = 30;
		System.out.println("main1 :" + f1.i );
		f1.test1();
		System.out.println("main2 :" + f1.i );
		f1.i += 40;
		f1.test2();
		System.out.println("main3 : " + f1.i);
	}
}
