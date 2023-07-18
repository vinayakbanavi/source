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
class T extends A 
{
	T()
	{
		super(90);
		System.out.println("T()");
	}

	T(int i)
	{
		System.out.println("T(int)");
	}

	public static void main(String[] args) 
	{
		T t1 = new T(10);
		System.out.println("----------");
		T t2 = new T();
	}
}
/*
A()
T(int)
--------------
A(int)
T()
*/