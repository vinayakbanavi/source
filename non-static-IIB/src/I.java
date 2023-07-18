class I 
{
	I()
	{
		this(90);
		System.out.println("I()");
	}

	I(int i)
	{
		this(15, 38);
		System.out.println("I(int)");
	}

	I(int i, int j)
	{
		System.out.println("I(int,int)");
	}

	{
		System.out.println("IIB");
	}

	public static void main(String[] args) 
	{
		I i1 = new I();
		System.out.println("-----------");
		I i2 = new I(10,65);
		System.out.println("-----------");
		I i3 = new I(58);
	}
}

/*
IIB
I(int,int)
I(int)
I()
------------
IIB
I(int)
------------
IIB
I(int,int)
I(int)

*/