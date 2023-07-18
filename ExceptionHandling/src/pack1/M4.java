package pack1;

public class M4 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		String s1 = null;
		
		int i = s1.length();
//		s1 is referring to null
//		can not call any method from null reference.
		
//		Abnormality - NullPointerException 
//		Not handled FLow get Terminates
		
		System.out.println("main end");
	}
}
