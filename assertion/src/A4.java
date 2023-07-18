class A4
{

	static int i;

	public static void main(String[] args) 
	{
		System.out.println("main begin : " + i);
		assert test();
		System.out.println("main end :" + i);
	}

	static boolean test()
	{
//		i value getting modified only for certain set of users with enabled assertion
//      which is not recommended
		i = 10;
		return true;
	}

}
