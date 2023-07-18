class K
{

	static void test1() 
	{
		System.out.println("test1 method");
	}	
	
	static void main(String[] args) 
	{
		System.out.println("main method"); 
		test1();
		test2();
        System.out.println("main method");
	}	
	static void test2() 
	{
		System.out.println("test2 method begin");
		test1();
		System.out.println("test2 method end");
	}	
	
}

// main method should be always public remaining methods may or may not be public
//ERROR MAIN METHOD IS NOT DECLARED 'PUBLIC STATIC'