class W 
{
	W()
	{
		System.out.println("W()");
	}

	W(int i)
	{
		this();
		System.out.println("W(int)");
	}

	{
		System.out.println("W - IIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		W w1 = new W();
		System.out.println("----------");
		W w2 = new W(9);
		System.out.println("main end");
	}
}

// IIB content moved into the constructor body, Constructor are not inheriting to Subclass hence IIBs are also not inheriting to subclass.