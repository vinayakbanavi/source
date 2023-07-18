package pack2;

public class M5 
{
	static C test()
	{
		return new C();
	}
	public static void main(String[] args) 
	{
		Object o1 = test();   // Object o1 =(Object) new C() autoUpcasting
		A a1 = test();
		B b1 = test();
		C c1 = test();
	}
}
