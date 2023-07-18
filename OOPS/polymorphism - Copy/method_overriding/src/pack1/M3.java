package pack1;

class E
{
	void test(int i, int j)
	{
		System.out.println("E - test(int , int )");
	}
}

class F extends E
{
	void test(int x, int y)
	{
		System.out.println("F - test(int , int )");
	}
}
public class M3 
{
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.test(10, 100);
	}
}
