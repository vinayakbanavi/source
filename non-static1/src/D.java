class D
{
	int i;
	static
	{
		D d1 = new D();
	}

	D()
	{
		i = 10;
		System.out.println("Inside Constructor");
	}

	public static void main(String[] args) 
	{
		D d1 = new D();
		D d2 = new D();
		D d3 = new D();
		System.out.println(d1.i + ", " + d2.i + ", " + d3.i);
	}
}

// through constructor we can initiallize non static member
