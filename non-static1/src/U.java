class U 
{
	U()
	{
		this(9, 89);
		System.out.println("U()");
	}

	U(int i, int j)
	{
		this(true);
		System.out.println("U(int, int)");
	}

	U(boolean b1)
	{
		System.out.println("U(boolean)");
	}

	public static void main(String[] args) 
	{
        U u1 = new U();
		System.out.println("-----------------");
        U u2 = new U(20, 60);
		System.out.println("-----------------");
        U u3 = new U(true);
		System.out.println("-----------------");
	}
}

// by default only one constructor will execute, but using call to this statement it is possible to execute more than one constructor