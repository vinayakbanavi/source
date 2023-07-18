abstract class W
{
	static abstract void test();  // illegal combination of modifiers
//  in subclass static members cannot be overrided but abstract demands implementation in subclass
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
