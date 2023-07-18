class E           //superclass
{
	static int i;

	static void test1()
	{
		System.out.println("test1 of E");
	}

}

class F extends E 
//subclass
{
	static int j;

	static void test2()	
	{
		System.out.println("test2 of F");
	}

	public static void main(String[] args) 
	{	
		test1();
		test2();
		System.out.println(i + ", " + j);
	}
}
