package pack4;

class C3
{
//  Constructor can throw Exception
	C3() throws ClassNotFoundException
	{

	}

	public static void main(String[] args) throws ClassNotFoundException
	{
		C3 obj = new C3();
		System.out.println("Compiles?");
	}
}
