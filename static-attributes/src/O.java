 class O
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println("main1 : " + a);
		int a = 9;                           
		System.out.println("main2 : " + O.a); 
		System.out.println("main3 : " + a);
		a = 91;
		O.a = 10;
		System.out.println("main4 : " + O.a); 
		System.out.println("main5 : " + a);

		final O o1 = new O();
		o1 = new O();
	}
}
/*
0
0
9
10
91
*/