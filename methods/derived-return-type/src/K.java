class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println( test() + test() + " is the sum");
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
50 is the sum
main end
*/