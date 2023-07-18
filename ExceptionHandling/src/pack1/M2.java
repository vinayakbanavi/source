package pack1;

public class M2 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Object obj = new Object();
//		Abnormality - ClassCastException 
//		Not handled FLow get Terminates
		String s1 = (String) obj;
		System.out.println("main end");
	}
}
