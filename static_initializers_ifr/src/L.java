class L 
{
	static int i = test();

	static int test()
	{
		return j;
	}
    static int j;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}

// except direct read everything is poosible before JVM notifying