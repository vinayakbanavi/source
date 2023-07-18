class Y 
{
//	error: cannot declare both test(int...) and test(int[]) in Y  static void test(int ... b)

// Even though there is change in signature we will get compile time error 
// Over loading is not possible
// because var args internally using array

	static void test(int[] a)
	{
		System.out.println("test(int[])");
	}
	
	static void test(int ... b)
	{
		System.out.println("test(int ...)");
	}

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
