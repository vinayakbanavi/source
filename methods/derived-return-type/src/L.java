class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("the sum is : " + (test() + test()));
		System.out.println("main end");
	}
	public static int test()
	{
		System.out.println("test method");
		return 25;
	}
}

/*
main begin
test method
test method
the sum is : 50
main end

*/