package pack2;

class C<T>
{
	public void test(T arg)
	{
		System.out.println("C test");
	}
}

public class M3 
{
	public static void main(String[] args) 
	{
		C<Integer> c1 = new C();
		c1.test(100);
		
		C<String> c2 = new C();
		c2.test("hello");
		
		C c3 = new C();
		c3.test(10);
		c3.test(1.05);
		c3.test('A');
		c3.test(true);
		c3.test("String");
		c3.test(null);
	}
}
