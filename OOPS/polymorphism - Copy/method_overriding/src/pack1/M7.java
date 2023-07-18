package pack1;

class M
{
	private void test()
	{
		System.out.println("M - test");
	}
}

class N extends M
{
	protected void test()
	{
		System.out.println("N -test");
	}
}

public class M7 
{
	public static void main(String[] args) 
	{
		N n1 = new N();
		n1.test();
		
//		M obj = new N();
//		obj.test();
	}
}

// while overriding a method access level should be similar or wider
// private < default < protected < public

