class B6
{
	public static void main(String[] args) 
	{
//		if method throwing Checked Exception/Error we cannot call the method directly without try/catch
//		test1();
//		test2();	
//      if method throwing unchecked we can directly call the method. Compilation will be Successfully
		test3()
	}
	static void test1()  throws InterruptedException
	{
	}

	static void test2() throws ClassNotFoundException
	{
	}

	static void test3() throws NullPointerException
	{
	}
}

