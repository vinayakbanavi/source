class  G
{
	{
		System.out.println("G-IIB");
	}

	G(int i)
	{
		System.out.println("G(int)");
	}

	G()
	{
		this(10);
		System.out.println("G()");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("-----------");
		G g1 = new G();
		System.out.println("-----------");
		G g2 = new G(52);
		System.out.println("-----------");
		System.out.println("main end");
	}
}
