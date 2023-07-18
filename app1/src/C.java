class C
{
	int i=10;
	static int j=15;
	static C c1;
	public static void main(String[] args) 
	{
		c1 = new C();
		int k = int i + j;
		System.out.println("Hello World!");
		c2 = new C();
		System.out.println(c1.i);
		System.out.println(C2.k);

	}
}
