class H 
{
	H(int i, int j)
	{
		System.out.println("H(int)");
	}

	H(boolean b1)
	{
		this(1, 2);
		System.out.println("H(boolean)");
	}

	public static void main(String[] args) 
	{
		H h1 = new H(20, 30);
		System.out.println("------------");
		H h2 = new H(true);
	}

	{
		System.out.println("H-IIB");
	}
}

// IIB execution is object wise- whenever object is creating all IIB are executing one time,