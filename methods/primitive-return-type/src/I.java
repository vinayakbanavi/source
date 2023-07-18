class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		char b1 = test();
		System.out.println("main end " + b1);
	}
	static char test()
	{	
		System.out.println("from test");
		return 'A';
	}
}
//return type, return value & receving variable type should be same