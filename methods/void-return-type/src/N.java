class N
{

	static void test() 
	{
		System.out.println("test1 method");
		System.out.println(i);
	}	
	
	public static void main(String[] args) 
	{
		System.out.println("main method begin"); 
		int i = 10;
		test();
        System.out.println(i);
        System.out.println("main method end");
	}	
}
/*
--> EVERY METHOD SHOULD HAVE A RETURN TYPE
--> RETURN TYPE SHOULD BE SPECIFIED BEFORE NAME OF THE METHOD
--> THREE ARE THREE DIFFERENT RETURN TYPES AVAILABLE
    1) VOID            : it should not return a value
	2) ANY PRIMITIVE
	3) ANY DERIEVED
*/