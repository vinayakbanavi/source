package pack1;

interface V
{
	void test1();
}

class W
{
	void test2()
	{
		System.out.println("W - test2");
	}
}

// Same class can have both extends and implements
// while doing both extends and implements we must follow the order
// 1st extends
// 2nd implements

class X extends W implements V
{
//  interface methods should always implemented with public
	public void test1()
	{
		System.out.println("X - test1");
	}
}
public class M13 
{
	public static void main(String[] args) 
	{
		System.out.println("M13 - main");
		X x1 = new X();
		x1.test1();
		x1.test2();
	}
}
