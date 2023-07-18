public class A5 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		String s1 = "123";
		int i = Integer.parseInt(s1);
//		int i = Integer.valueOf(s1);             
//		valueOf() also converts String to int

//		Abnormality - No abnormality
//		Flow continues
		
		System.out.println("main end");
	}
}