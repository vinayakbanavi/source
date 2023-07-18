package pack4;

class D9
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			System.out.println("from if");
//          throw is a keyword used to generate specified Error/Exception Object explicitly from runtime environment
			throw new NullPointerException("Generated through throw keyword");
		}
		System.out.println("main end");
	}
}
