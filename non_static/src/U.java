class U
{
	int i;

	static U test(U arg)
	{
		U u1 = new U();
		u1.i = arg.i + 20;
		arg.i = u1.i + 30;
		return u1;
	}

	public static void main(String[] args) 
	{
		U obj1 = new U();
		obj1.i = 40;
		U obj2 = test(obj1);
		System.out.println("main : " + obj1.i + ", " + obj2.i);
	}
}
/*
main : 90, 60
*/