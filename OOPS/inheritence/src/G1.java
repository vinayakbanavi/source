class G1 extends Object
{
	G1()
	{
		super();
		System.out.println("G1()");
	}
}

class H1 extends G1
{
	H1()
	{
		System.out.println("H1()");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H1 h1 = new H1();
		System.out.println("main end");
	}
}

// if there is a class without extends compiler will build extends built in class OBJECT