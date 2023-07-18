package pack1;

class E
{
	static void test()
	{
		System.out.println("E - test");
	}
	
	static
	{
		System.out.println("E - SIB");
	}
}
class F extends E
{
//	test() inherited but acting as Superclass member only
//	       not acting as a subclass member
//  if we can't override a superclass method than   is not possible
	static
	{
		System.out.println("F - SIB");   
	}

}

public class M3
{
	public static void main(String[] args) 
	{
		F.test();
//		so when we are calling F.test() F will not load since test() will be executed from E itself
	}
}
