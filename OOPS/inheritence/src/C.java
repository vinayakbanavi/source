class C           //superclass
{
	int i;

	void test1()
	{
		System.out.println("test1 of C");
	}

}

class D extends C //subclass
{
	int j;

	void test2()	
	{
		System.out.println("test2 of D");
	}

	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println(d1.i);
		System.out.println(d1.j);
		d1.i = 54;
		d1.j = 8;
		System.out.println(d1.i);
		System.out.println(d1.j);
		d1.test1();
		d1.test2();

	}
}
