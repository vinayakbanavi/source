class L
{

	static void test() 
	{
		System.out.println("test method");
	}	
	
	public static void main(String[] args) 
	{
		System.out.println("main method"); 
		test();
		test();
		test();
		test();
        System.out.println("main method");
	}	
}