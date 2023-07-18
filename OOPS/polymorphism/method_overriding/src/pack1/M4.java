package pack1;

abstract class G
{
	abstract void test();
}

class H extends G
{
	void test()
	{
		System.out.println("H - test");
	}
}

public class M4 
{
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.test();
	}
}

// Abstract methods are overriding in the subclass