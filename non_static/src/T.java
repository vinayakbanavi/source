class T 
{
	int i;

	static T test()
	{
		return new T();
	}

	public static void main(String[] args) 
	{
		T t1 = test()
		System.out.println("main : " + t1.i);
	}
}
