class K 
{
	K(int i)
	{
		System.out.println("K(int)");
	}
	
	K(double i)
	{
		System.out.println("K(double)");
	}

	public static void main(String[] args) 
	{
		K k1 = new K(100);
		System.out.println("----------------");
		K k2 = new K(18.5);
		System.out.println("----------------");
		K k35 = new K(-58);
		System.out.println("----------------");
		K k4 = new K(0.85);
		System.out.println("----------------");
	}
}

/*
changes in the signature like
there should be change in the number of arguments
or there should be change in the datatype
 
by default same constructer will execute whichever constructer is specifyed while object creating
*/