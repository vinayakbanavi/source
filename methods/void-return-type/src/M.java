class M
{

	static void test() 
	{
		System.out.println("test method");
		int i = 10;
	}	
	
	public static void main(String[] args) 
	{
		System.out.println("main method"); 
		test();
        System.out.println(i);
        System.out.println("main method");
	}	
}