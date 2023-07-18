package pack4;

class A
{
	A() throws ClassNotFoundException
	{
	}
}

class C6 extends A
{
	C6()
	{
		try
		{
			super();
		}
		catch (ClassNotFoundException ex)
		{
		}
	}

	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("Compiles?");
	}
}
