class C3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int[] elements ={10, 20, 30, 40, 50};
			int i = elements[5];
			System.out.println("try end");
		}
		catch (ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("from catch");
			ex.printStackTrace();
//          printing information about handled Exception Object
		}

		System.out.println("main end");
	}
}