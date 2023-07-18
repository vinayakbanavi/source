public class A2 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Object obj = new Object();

		String s1 = (String) obj;

//      DownCasting is valid only if object is instanceof the class which we are downcasting to
//		obj is not a instanceof String class
//		Abnormality - ClassCastException 
//		Not handled FLow get Terminates

		System.out.println("main end");
	}
}
