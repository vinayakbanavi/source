class I //extends Object ---> (java.lang packages)
{
	I()
	{
		//super();
		System.out.println("I()");
	}
}

class J extends I
{
	J()
	{
		//super();
		System.out.println("J()");
	}
}

class K extends J
{
	K()
	{
		//super(); compiler adds super calling statement by default while compiling
		System.out.println("K()");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		K k1 = new K();
		System.out.println("----------");
		J j1 = new J();
		System.out.println("----------");
		I i1 = new I();
		System.out.println("main end");
	}
}

//object class containing essential members whichever required for all the classes