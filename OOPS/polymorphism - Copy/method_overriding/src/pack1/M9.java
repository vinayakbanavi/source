package pack1;

class Q
{
	void test()
	{
		System.out.println("Q - test");
	}
}

class R extends Q
{
	int test()
	{
		System.out.println("R - test");
		return 100;
	}
}

public class M9 
{
	public static void main(String[] args) 
	{
		
	}
}

// return type should be same while overriding a method
// different return type for same method not possible