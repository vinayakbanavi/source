package pack2;

class B
{
	private int i;
	
	B()
	{
		i = 25;
	}
	
	public void test()
	{
		System.out.println(i);
	}
}

public class A extends B
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		
		a1.test();
	}
}
// even though i is having private access in class B
// inherited test() in class A can use i, since test() originally belongs to B
// same class methods can access the private members