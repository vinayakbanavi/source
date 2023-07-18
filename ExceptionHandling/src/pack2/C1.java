class C1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

	void test()
	{
		try
		{
			clone();
		}
		catch (CloneNotSupportedException ex)
		{
		}
	}
}