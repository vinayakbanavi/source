class H 
{
	int a;
	public static void main(String[] args) 
	{
		H h1 = new H();
		H h2 = h1;
		System.out.println(h1.a + ", " + h2.a);
		h1.a = 100;
		System.out.println(h1.a + ", " + h2.a);
		h2.a = 350;
		System.out.println(h1.a + ", " + h2.a);
		H h3 = h2;
		System.out.println(h1.a + ", " + h2.a + ", " + h3.a);
		h3.a = 30;
		System.out.println(h1.a + ", " + h2.a + ", " + h3.a);
	}
}
