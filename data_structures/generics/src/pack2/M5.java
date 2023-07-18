package pack2;

class E<A, B>
{
	A ref1;
	B ref2;

	public void test1(A arg1, B arg2)
	{
		System.out.println("E test1");
	}
	
	public void test2(B arg1, A arg2)
	{
		System.out.println("E test2");
	}
	
	public void test3(A arg1, int arg2)
	{
		System.out.println("E test3");
	}
}

public class M5 
{
	public static void main(String[] args) 
	{
		E<String, Integer> obj1 = new E();
		obj1.ref1 = "Hrishi";
		obj1.ref2 = 100;
		
		obj1.test1("String", 100);
		obj1.test2(150, "String");
		obj1.test3("hello", 0);
		
		E<Integer, Integer> obj2 = new E();
		obj2.ref1 = 150;
		obj2.ref2 = 250;
		
		obj2.test1(150, 150);
		obj2.test2(10, 150);
		obj2.test3(1, 2);
		
	}
}
