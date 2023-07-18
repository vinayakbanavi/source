class J
{
	int a;
	public static void main(String[] args) 
	{
		J j1 = new J();
		j1.a = 200;
		System.out.println("main 1 : " + j1.a);
		J j2 = new J();
		j2.a = 300;
		System.out.println("main 2 : " + j1.a);
		System.out.println("main 3 : " + j2.a);
		j1.a = 30;
		j2.a = 3;
		System.out.println("main 4 : " + j1.a);
		System.out.println("main 5 : " + j2.a);
	}
}

