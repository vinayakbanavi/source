package pack1;

interface P
{
	void test1();
	void test2();
	void test3();
}

abstract class Q implements P
{
	public void test1()
	{
		System.out.println("Q - test1");
	}
}

class R extends Q
{
	public void test2()
	{
		System.out.println("R - test2");
	}
	public void test3()
	{
		System.out.println("R - test1");
	}
}
public class M11
{
	public static void main(String[] args) 
	{
		R r1 = new R();
		r1.test1();
		r1.test2();
		r1.test3();
	}
}

/*
		Subclass to interface cannot be concrete if it does not implement all the methods of a interface
		
 */ 
