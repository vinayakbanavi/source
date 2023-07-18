package pack2;

public class M6
{
	public static void main(String[] args) 
	{
		A a1 = new C();
//		B b1 = a1;
//		C c1 = a1;
//		C c2 = b1;
		
//		if left operand is subClass Type and right side operand is superClass Type
//		explicit downCasting
		B b1 = (B) a1;
		C c1 = (C) a1;
		C c2 = (C) b1;
		System.out.println("done");
	}
}
