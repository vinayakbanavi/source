package pack4;

class A
{
	A() throws ClassNotFoundException
	{
	}
}

class C5 extends A
{
	C5() throws ClassNotFoundException
	{
	}

	public static void main(String[] args)
	{
		System.out.println("Compiles?");
	}
}
