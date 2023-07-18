class P
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println("main1 : " + a);    
		System.out.println("main2 : " + P.a); 
		System.out.println("main3 : " + a);
		a = 91;
		System.out.println("main4 : " + P.a); 
		P.a = 10;
		System.out.println("main5 : " + a);
	}
}

/*
0
0
0
91
10
*/