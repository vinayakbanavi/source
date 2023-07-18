/*
	Handling an Exception Rising in the Catch Body

*/
class D5
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = 10/0; 
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch begin");
			try
			{
				System.out.println("inner try begin");
				int i = 10/0; 
				System.out.println("inner try end");
			}	
			catch(ArithmeticException ref)
			{		
				System.out.println("from inner catch");
			}
			System.out.println("catch end");
		}
		System.out.println("main end");
	}
}
