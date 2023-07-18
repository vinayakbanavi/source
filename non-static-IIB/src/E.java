class E 
{
	E()
	{
		System.out.println("E()");
	}

	{
		System.out.println("E-IIB1");
	}

	E(int i)
	{
		System.out.println("E(int)");
	}

	E(int i, int j)
	{
		System.out.println("E(int,int)");
	}

	{
		System.out.println("E-IIB2");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("-----------");
		E e1 = new E();
		System.out.println("-----------");
		E e2 = new E(25);
		System.out.println("-----------");
		E e3 = new E(30,57);
		System.out.println("-----------");
		System.out.println("main begin");
	}
}
