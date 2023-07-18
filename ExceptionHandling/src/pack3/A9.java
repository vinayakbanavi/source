class A9
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}

//  Explicitly mentioning throws so that byPassing compiler to not look for try catch for checked Exception obj
	public static void test() throws ClassNotFoundException
	{
		System.out.println(3);
		Class.forName("");
		System.out.println(4);
	}
}