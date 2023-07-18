class V 
{
	V()
	{
		System.out.println("V()");
	}

	V(int i)
	{
		
		System.out.println("V(int)");
		this();
		
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
