 package pack2;

public class M3 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		
//		Object class is superMost class to all the classes.
//		So any derived assignment to Object reference will be autoUpcasting 
		Object o1 = new C();
		Object o2 = new B();
		Object o3 = new A();
		
		o1 = a1;
		o2 = a1;
		o3 = a1;
		
		B b1 = new B();
		a1 = b1;
		o1 = b1;
		
		System.out.println("done");
				
	}
}
