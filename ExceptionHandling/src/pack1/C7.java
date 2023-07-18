class C7
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			StringBuffer[] array = new StringBuffer[999999999];
			for (int i =0; i < array.length ; i++)
			{
				array[i] = new StringBuffer("hello");
			}

			System.out.println("try end");
		}
		catch (OutOfMemoryError ex)
		{
			System.out.println("from catch");

		}

		System.out.println("main end");
	}
} 