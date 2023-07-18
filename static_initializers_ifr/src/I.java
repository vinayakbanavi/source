class I 
{
	static int i;

	static int j = i;           //direct read
	static int k = test();
	
	static int test()
	{
		return i;               //indirect read
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


// ifr --> illegal forward reference
// direct read is not allowed before JVM notifying 