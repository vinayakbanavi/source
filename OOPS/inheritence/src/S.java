class A 
{
	A()
	{
		System.out.println("A()");
	}

	A(int i)
	{
		System.out.println("A(int)");
	}
}
class S extends A 
{
	S()
	{
		System.out.println("S()");
	}

	S(int i)
	{
		System.out.println("S(int)");
	}

	public static void main(String[] args) 
	{
		S s1 = new S(10);
		System.out.println("----------");
		S s2 = new S();
	}
}

/*
A()
S(int)
----------
A()
S()
*/