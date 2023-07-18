class  E
{
	int i;

	void test()
	{
		System.out.println("test : " + i);
		i += 60;
	}
	public static void main(String[] args) 
	{
		E obj = new E();
		obj.i = 20;
		System.out.println("main1 : " + obj.i);
		obj.test();
		System.out.println("main2 : " + obj.i);
	}
}
