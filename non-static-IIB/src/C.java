class C 
{
	C()
	{
		System.out.println("C()");
	}

	{
		System.out.println("C-IIB");
	}

	C(int i)
	{
		System.out.println("C(int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C c1 = new C();
		System.out.println("-----------");
		C c2 = new C(20);
		System.out.println("main end");
	}
}
