class K 
{
	K(int i)
	{
		System.out.println("K(int)");
	}
}

class L extends K
{
	L(int i)
	{
		System.out.println("L(int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		L l1 = new L(9);
		System.out.println("main end");
	}
}
