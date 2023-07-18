package pack1;

class C
{	
	public void test(boolean flag)
	{
		System.out.println("C - test");
	}
}

public class M3 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.test(false);
		
		C c2 = new C();
		c2.test(true);
		
		C c3 = new C();
//		c3.test("hello"); type incompatible
		
//		for every object of C, test methods argument type will be boolean.
	}
}
