 package pack2;

public class M7 
{
	public static void main(String[] args) 
	{
		Object obj = new C();
		
//		A a1 = obj;
//		B b1 = a1;
//		B b2 = obj;
//		C c1 = obj;
//		C c2 = a1;
//		C c3 = b1;
//		C c4 = b2;
		
		A a1 = (A) obj;
		
		B b1 = (B) obj;
		B b2 = (B) a1;
		
		C c1 = (C) obj;
		C c2 = (C) a1;
		C c3 = (C) b1;
		C c4 = (C) b2;
		
		System.out.println("done");
	}
}
