public class A3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Object obj = new Object();
		
		Integer i1 = (Integer) obj;             
//		Explicit DownCasting but obj is not a instanceof Integer
		
//		Abnormality - ClassCastException 
//		Not handled FLow get Terminates
		
		System.out.println("main end");
	}
}
