class A4
{
	public static void main(String[] args) 
	{
//		the following statement generates NumberFormatException
//      Compiler will not bother about the Exception 
//      Compiles Successfully

		int i = Integer.parseInt("abc");
	}
}
