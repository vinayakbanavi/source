class H
{

	public static void test1() 
	{
		System.out.println("test1 method");
	}	
	
	public static void main(String[] args) 
	{
		System.out.println("main method"); 
		System.out.println("-------");
		test1();
		test2();
		test1();
		test2();
        System.out.println("-------");
        System.out.println("main method");
	}	
	public static void test2() 
	{
		System.out.println("test2 method");
	}	
	
}
