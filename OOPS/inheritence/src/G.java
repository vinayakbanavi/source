class G
{
	G()
	{
		System.out.println("G()");
	}
}

class H extends G
{
	H()
	{
		//super(); compiler adds super calling statement by default while compiling
		System.out.println("H()");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H h1 = new H();
		System.out.println("main end");
	}
}

// all type of attributes and methods are inheriting  to subclass.
// constructors, IIbs and SIbs are not inheriting to Subclass.