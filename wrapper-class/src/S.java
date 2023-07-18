class S	
{
/*
	static void test(int i)
	{
		System.out.println("test(int)");     // first preference Auto Widening
	}

	static void test(Byte i)          
	{
		System.out.println("test(Byte)");    // second preference Auto Boxing
	}

	static void test(Number i)          
	{
		System.out.println("test(Number)");    // third preference Auto Boxing
	}

	static void test(Object i)
	{
		System.out.println("test(Object)");  // fourth preference Auto Upcasting
	}
*/
	static void test(byte ... i)
	{
		System.out.println("test(Var arg)"); // fifth preference var Args
	}

	public static void main(String[] args) 
	{
		byte b1 = 10;
		test(b1);
	}
}


/*
		Every Numeric Wrapper class is a subclass to Number
		One Wrapper cannot be converted into Other
		Auto widening is only avaialable with primitive data type
		in case of Wrapper clases Auto Upcasting

																Object
																  |
																  |
																Number
																  |
	                  ------------------------------------------------------------------------------------------															  |
	                  |                |                 |                  |                 |                |
		             Byte            Short             Integer            Long              Float            Double            
*/