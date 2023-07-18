class W 
{
	W(int i)
	{
		this();
		System.out.println("W(int i)");
	}
	public static void main(String[] args) 
	{
		W w1 = new W(10);
		System.out.println("Hello World!");
	}
}

// for every call to this statement correspondig constructor should be present