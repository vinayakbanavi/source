class G
{
	static int i;

	static
	{
		i = 10;                        // direct write
		System.out.println(i);         // direct read
		G.i = 10;                      // indirect write
		System.out.println(G.i);       // indirect read
		test();
	}
	static void test()
	{
		i = 10;                         // indirect write
		System.out.println(i);         // indirect read
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
