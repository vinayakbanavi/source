class I 
{
	int a;
	boolean b;

	I(int i, boolean j)
	{
		a = i;
		b = j;
	}

	public static void main(String[] args) 
	{
		I obj1 = new I(150, true);
		System.out.println("-----------------");
		I obj2 = new I(485, false);
		System.out.println(obj1.a + ", " + obj1.b);
		System.out.println(obj2.a + ", " + obj2.b);
		System.out.println(obj1.b + ", " + obj2.b);
	}
}
