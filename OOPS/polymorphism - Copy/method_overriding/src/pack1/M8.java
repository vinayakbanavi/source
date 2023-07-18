package pack1;

class O
{
	static void test()
	{
		System.out.println("O - test");
	}
}

class P extends O
{
	void test()
	{
		System.out.println("P - test");
	}
}

public class M8 
{

}

// Static method should override with static only
// Non static method should override with non static only
// static method can't override by a non static method and vice - versa