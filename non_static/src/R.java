class R 
{
	int i;
	static void test(R obj1, R obj2)
	{
		System.out.println("test : " + obj1.i + ", " + obj2.i);
		int y = obj1.i;
		obj1.i = obj2.i;
		obj2.i = y;
	}
	public static void main(String[] args) 
	{
		R r1 = new R();
		R r2 = new R();
		r1.i = 10;
		r2.i = 20;
		System.out.println("main1 : " + r1.i +", " + r2.i);
		test(r1,r2);
		System.out.println("main2 : " + r1.i +", " + r2.i);
	}
}

/*
main1 : 10, 20
test : 10, 20
main 2 : 20 , 10
*/