class M 
{
	M(int i)
	{
		System.out.println("M(int)");
	}
}

class N extends M
{
	N(int i)
	{
		super(25);
		System.out.println("N(int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		N n1 = new N(9);
		System.out.println("main end");
	}
}

/*
main begin
m(int)
N(int)
main end
*/