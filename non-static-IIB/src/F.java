 class F 
{
	static int i;

	F()
	{
		System.out.println("F()");
	}

	{
		i++;
		System.out.println("F-IIB1");
	}

	F(int i)
	{
		this();
		System.out.println("F(int)");
	}

	F(int i, int j)
	{
		System.out.println("F(int,int)");
	}

	{
		System.out.println("F-IIB2");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("-----------");
		F f1 = new F();
		System.out.println("-----------");
		F f2 = new F(25);
		System.out.println("-----------");
		F f3 = new F(30,57);
		System.out.println("-----------");
		System.out.println("main end : " + i);
	}
}
