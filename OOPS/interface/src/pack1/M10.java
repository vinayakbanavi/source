package pack1;

interface N
{
	void test1();
	void test2();
}

class O implements N
{
	public void test1()
	{
		System.out.println("test1 - N");
	}
	
	public void test2()
	{
		System.out.println("test2 - N");
	}
}

public class M10 
{
	public static void main(String[] args) 
	{
		System.out.println("main - M10");
		O o1 = new O();
		o1.test1();
		o1.test2();
	}
}

// we cannot use interface members directly
// we have to create subclass to the interface and create object in that subclass