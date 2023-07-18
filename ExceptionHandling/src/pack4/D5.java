package pack4;

class A
{
	void test1() throws Throwable
	{
	}
}

class D5 extends A
{
// if superclass method throws Throwable we can override this method by throwing
// 1. no throw
// 2. throw unchecked
// 3. throw checked
	void test1() throws ClassNotFoundException
	{
		System.out.println("overrided test1() throws ClassNotFoundException");
	}
}