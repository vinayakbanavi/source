class  D
{
	int i;

	void test()
	{
		System.out.println("test : " + this.i);
		this.i = 60;
	}
	public static void main(String[] args) 
	{
		D obj = new D();
		obj.i = 20;
		System.out.println("main1 : " + obj.i);
		obj.test();
		System.out.println("main2 : " + obj.i);
	}
}
