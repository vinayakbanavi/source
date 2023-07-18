package pack1;

public class M8 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		main(args);
//		calling main();
//		infinite execution. Stack memory getting filled. 
//		stack over flow
		
//		Abnormality - StackOverFlowError
//		Not handled FLow get Terminates
		
		System.out.println("main end");
	}
}
