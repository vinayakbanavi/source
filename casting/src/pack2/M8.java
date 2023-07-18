package pack2;

public class M8 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = (B) a1;
		C c1 = (C) a1;
		
		System.out.println("done");
	}
}

// in derived casting, down casting cannot be carried independently 
// compilation will be successful if we assign superclass Object to sub class reference with ExplicitDowncasting
// but during runtime we will get ClassCastException
// Down casting is allowed if already up casting is happened