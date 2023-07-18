package pack4;

class C2
{
//  Constructor can throw Exception
	C2() throws ClassNotFoundException
	{

	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			C2 obj = new C2();
			System.out.println("try end");
			

		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
