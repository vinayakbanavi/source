package pack1;

public class M5 
{
	public static void main(String[] args) 
	{
		int i = 100;
		byte b1 = 100;
		i = b1;
		
//		right hand side is wider than the left hand side 
//		byte <--- int   explicit narrowing
		
//		Compiler will not perform explicit narrowing because it warns us of losing data 
//		even though if we want casting user must perform Explicit Narrowing
		b1 = (byte)i; 
		System.out.println("done");
	}
}
