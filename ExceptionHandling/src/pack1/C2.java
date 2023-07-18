class C2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			String s1 = null;
			int i = s1.length();
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch");
			ex.printStackTrace();
//          printing information about handled Exception Object
		}

		System.out.println("main end");
	}
}

// catch must be compatible to rised Abnormality in try Block
// catch is speciallized in ArithmeticException
// but we are getting Null pointer Exception
// So rised Abnormality not getting handled so flow gets Terminated
