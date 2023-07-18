class O	 
{
	public static void main(String[] args) 
	{
		System.out.println("byte min value  --> "  + Byte.MIN_VALUE);                           
		System.out.println("byte max value  --> "  + Byte.MAX_VALUE);
		System.out.println("short min value --> "  + Short.MIN_VALUE);
		System.out.println("short max value --> "  + Short.MAX_VALUE);
		System.out.println("int min value   --> "  + Integer.MIN_VALUE);
		System.out.println("int max value   --> "  + Integer.MAX_VALUE);
		System.out.println("long min value  --> "  + Long.MIN_VALUE);
		System.out.println("long max value  --> "  + Long.MAX_VALUE);
		System.out.println("char min value  --> "  + (int)Character.MIN_VALUE);
		System.out.println("char max value  --> "  + (int)Character.MAX_VALUE);
	
	}
}

/*

	byte < short < char < int < long
	
	byte min value  --> -128
	byte max value  --> 127
	short min value --> -32768
	short max value --> 32767
	int min value   --> -2147483648
	int max value   --> 2147483647
	long min value  --> -9223372036854775808
	long max value  --> 9223372036854775807
	char min value  --> 0
	char max value  --> 65535


*/