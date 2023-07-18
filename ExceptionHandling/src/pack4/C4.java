package pack4;

class A
{
/*
	A() throws ArithmeticException
	{
	}
*/
	A() throws ClassNotFoundException
	{
	}
}

class C4 extends A
{
/*
	C4()
	{
		super();
	}
*/
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("Compiles?");
	}
}
