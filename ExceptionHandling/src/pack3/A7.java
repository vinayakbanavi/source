class A7
{
	public static void main(String[] args) 
	{
		System.out.println(1);
//	    G.java:6: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown test();
		test();
		System.out.println(2);
	}

//  Explicitly mentioning throws so that byPassing compiler to not look for try catch for checked Exception obj
//  throws is only for checked Exception
	public static void test() throws ClassNotFoundException
	{
		System.out.println(3);
		Class.forName("");
		Class.forName("");
		Class.forName("");
		Class.forName("");
		Class.forName("");
		System.out.println(4);
	}
}

