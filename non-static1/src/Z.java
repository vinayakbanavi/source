class Z 
{
	Z()
	{
		this(10);
	}

	Z(int i)
	{
		this();
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

// by using this cyclic invocation not allowed
//  error: recursive constructor invocation this(10);