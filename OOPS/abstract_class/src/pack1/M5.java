package pack1;

abstract class F
{
	
	void test1()
	{
		System.out.println("F-test1");
	}
	
	abstract void test2();
	abstract void test3();

}

abstract class G extends F
{
	void test2()
	{
		System.out.println("G - test2");
	}
}

class H extends G
{
	void test3()
	{
		System.out.println("H - test3");
	}
}
public class M5
{
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.test1();
		h1.test2();
		h1.test3();
	}
}
