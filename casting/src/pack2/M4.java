package pack2;

public class M4 
{
	static void test(A a1)
	{
		
	}
	
	public static void main(String[] args) 
	{
		B b = new B();
		C c = new C();
		
		test(b);              // test((A)b1)
		test(c);              // test((A)c1)
		
		test(new B());         // test((A) new B())
		test(new C());         // test((A)new C())
		
		System.out.println("done");
	}
}
