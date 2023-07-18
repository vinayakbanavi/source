public class M6
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		String s1 = "123s";
		int i1 = Integer.parseInt(s1);             
//		UnBoxing, but UnBoxed value and variable type mismatch
		
//		Abnormality - NumberFormatException 
//		Not handled FLow get Terminates
		
		System.out.println("main end");
	}
}

