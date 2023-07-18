class Z9
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		//int i;
		for (int i = 1, System.out.println("initialization" + i);
		     test(i);
			 System.out.println("before : " + i) , i++ , System.out.println("after : " + i))
		{
		System.out.println("loopy body : " + i);
		}
		System.out.println("main end");
	}

	public static boolean test(int i)
	{
		boolean b1 = i <= 5;
		System.out.println("boolean results for : " + i + " value : " + b1);
		return b1;  
	}
}
