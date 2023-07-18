class G
{

	public static void test1() 
	{
		System.out.println("test1 method");
	}	
	
	public static void main(String[] args) 
	{
		System.out.println("main method begin");
		test1();
        System.out.println("-------");
		test2();
        System.out.println("-------");
		test1();
        System.out.println("-------");
		test2();
        System.out.println("-------");
        System.out.println("main method end");
	}	
	public static void test2() 
	{
		System.out.println("test2 method");
	}	
	
}

// BY USING METHOD WE CAN ACHIEVE REUSEABILITY
