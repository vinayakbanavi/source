class S 
{
	int i;

	static S test()
	{
	    S s1 = new S();
		s1.i = 100;
		return s1;
	}
	public static void main(String[] args) 
	{
        S obj = test();
		System.out.println("main : " + obj.i);
	}
}

/*
main 100
*/