class D 
{
	D()
	{
		System.out.println("D()");
	}

	{
		System.out.println("D-IIB");
	}

	D(int i)
	{
		System.out.println("D(int)");
	}

	D(int i, int j)
	{
		System.out.println("D(int,int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("-----------");
		D d1 = new D();
		System.out.println("-----------");
		D d2 = new D(25);
		System.out.println("-----------");
		D d3 = new D(30,57);
		System.out.println("-----------");
		System.out.println("main begin");
	}
}
