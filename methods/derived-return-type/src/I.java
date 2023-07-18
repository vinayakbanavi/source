class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test() + test());
		System.out.println("main end");
	}
	public static int test()
	{
		System.out.println("test method");
		return 10;
	}
}

/*
main begin
test method
test method
20
main end
*/