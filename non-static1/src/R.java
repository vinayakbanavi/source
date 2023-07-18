class R 
{
	R()
	{
		System.out.println("R()");
	}

	R(int i)
	{ 
		this();                                    
		System.out.println("R(int)");
	}

	public static void main(String[] args) 
	{
		R r1 = new R();
		System.out.println("-----------");
		R r2 = new R(20);
		System.out.println("-----------");
	}
}
 //this(); ---> this calling statement --> call to other constructor of same class